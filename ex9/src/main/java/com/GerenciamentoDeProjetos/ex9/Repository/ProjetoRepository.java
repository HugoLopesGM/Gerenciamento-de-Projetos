package com.GerenciamentoDeProjetos.ex9.Repository;

import com.GerenciamentoDeProjetos.ex9.Model.ProjetoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository <ProjetoModel, Long>    {
}
