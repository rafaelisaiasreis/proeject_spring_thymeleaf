package com.curso.spring.thymeleaf.service;

import com.curso.spring.thymeleaf.domain.Cargo;

import java.util.List;

public interface CargoService {

    void salvar(Cargo cargo);

    void editar(Cargo cargo);

    void excluir(Long id);

    Cargo buscarPorId(Long id);

    List<Cargo> buscarTodos();

}
