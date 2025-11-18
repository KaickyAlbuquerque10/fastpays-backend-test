package com.fastpays.service;

import com.fastpays.entity.Pessoa;
import com.fastpays.entity.Empresa;
import com.fastpays.repository.PessoaRepository;
import com.fastpays.repository.EmpresaRepository;
import com.fastpays.util.CleanStringUtil;
import com.fastpays.util.CPFValidator;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PessoaService{
 private final PessoaRepository repo;
 private final EmpresaRepository empresaRepo;

 public PessoaService(PessoaRepository repo, EmpresaRepository empresaRepo){
  this.repo=repo; this.empresaRepo=empresaRepo;
 }

 public Pessoa create(Pessoa p, Long empresaId){
  Empresa e=empresaRepo.findById(empresaId).orElseThrow();
  String cpf=CleanStringUtil.onlyDigits(p.getCpf());
  if(!CPFValidator.isValidCPF(cpf)) throw new RuntimeException("CPF inválido");
  p.setCpf(cpf);
  p.setEmpresa(e);
  return repo.save(p);
 }

 public List<Pessoa> listAll(){return repo.findAll();}
 public List<Pessoa> listByEmpresa(Long id){return repo.findByEmpresaId(id);}
}
