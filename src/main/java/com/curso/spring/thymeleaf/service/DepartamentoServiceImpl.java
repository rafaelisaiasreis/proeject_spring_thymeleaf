package com.curso.spring.thymeleaf.service;

import com.curso.spring.thymeleaf.domain.Departamento;
import com.curso.spring.thymeleaf.repositories.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service @Transactional(readOnly = false)
public class DepartamentoServiceImpl implements DepartamentoService {

  @Autowired
  DepartamentoRepository departamentoRepository;

  @Override
  public void salvar(Departamento departamento) {
    departamentoRepository.save(departamento);
  }

  @Override
  public void editar(Departamento departamento) {
    departamentoRepository.saveAndFlush(departamento);
  }

  @Override
  public void excluir(Long id) {
    departamentoRepository.deleteById(id);
  }

  @Override @Transactional(readOnly = true)
  public Departamento buscarPorId(Long id) {
    return departamentoRepository.findById(id).orElseThrow(RuntimeException::new);
  }

  @Override @Transactional(readOnly = true)
  public List<Departamento> buscarTodos() {
    return departamentoRepository.findAll();
  }
}
