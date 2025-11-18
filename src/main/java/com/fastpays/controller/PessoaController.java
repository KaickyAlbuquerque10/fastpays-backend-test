package com.fastpays.controller;

import com.fastpays.entity.Pessoa;
import com.fastpays.service.PessoaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class PessoaController{
 private final PessoaService service;
 public PessoaController(PessoaService s){this.service=s;}

 @PostMapping("/pessoa")
 public Pessoa create(@RequestBody Pessoa p){
  return service.create(p,p.getEmpresa().getId());
 }

 @GetMapping("/pessoas")
 public List<Pessoa> list(){return service.listAll();}
}
