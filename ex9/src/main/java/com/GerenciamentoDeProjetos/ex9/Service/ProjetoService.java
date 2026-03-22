package com.GerenciamentoDeProjetos.ex9.Service;

import com.GerenciamentoDeProjetos.ex9.Model.ProjetoModel;
import com.GerenciamentoDeProjetos.ex9.Repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository projetoRepository;

    public ProjetoModel criar(ProjetoModel projeto) {
        return projetoRepository.save(projeto);
    }

    public List<ProjetoModel> findAll() {
        return projetoRepository.findAll();
    }

    public Optional<ProjetoModel> findById(Long id) {
        return projetoRepository.findById(id);
    }

    public void delete(Long id) {
        projetoRepository.deleteById(id);
    }
}
