package com.fastpays.service;

import com.fastpays.entity.Empresa;
import com.fastpays.repository.EmpresaRepository;
import com.fastpays.util.CleanStringUtil;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {
 private final EmpresaRepository repo;
 public EmpresaService(EmpresaRepository repo){this.repo=repo;}

 public Empresa create(Empresa e){
  e.setCnpj(CleanStringUtil.onlyDigits(e.getCnpj()));
  return repo.save(e);
 }

 public Empresa findById(Long id){
  return repo.findById(id).orElseThrow();
 }
}
