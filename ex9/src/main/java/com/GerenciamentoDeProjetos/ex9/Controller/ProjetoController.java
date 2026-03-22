package com.GerenciamentoDeProjetos.ex9.Controller;

import com.GerenciamentoDeProjetos.ex9.Model.ProjetoModel;
import com.GerenciamentoDeProjetos.ex9.Service.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Projeto")
public class ProjetoController {
    @Autowired
    private ProjetoService service;

    @PostMapping
    public ProjetoModel criar(@RequestBody ProjetoModel projetoModel){
        return service.criar(projetoModel);
    }

    @GetMapping
    public List<ProjetoModel> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<ProjetoModel>findById(@PathVariable Long id){
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}
