package com.fastpays.controller;

import com.fastpays.entity.Empresa;
import com.fastpays.service.EmpresaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/empresas")
public class EmpresaController{
 private final EmpresaService service;
 public EmpresaController(EmpresaService s){this.service=s;}

 @PostMapping
 public Empresa create(@RequestBody Empresa e){return service.create(e);}

 @GetMapping("/{id}")
 public Empresa get(@PathVariable Long id){return service.findById(id);}
}
