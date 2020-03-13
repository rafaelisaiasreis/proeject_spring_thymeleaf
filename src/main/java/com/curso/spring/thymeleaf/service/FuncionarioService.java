package com.curso.spring.thymeleaf.service;

import com.curso.spring.thymeleaf.domain.Cargo;
import com.curso.spring.thymeleaf.domain.Funcionario;

import java.util.List;

public interface FuncionarioService {

    void salvar(Funcionario funcionario);

    void editar(Funcionario funcionario);

    void excluir(Long id);

    Funcionario buscarPorId(Long id);

    List<Funcionario> buscarTodos();

}
