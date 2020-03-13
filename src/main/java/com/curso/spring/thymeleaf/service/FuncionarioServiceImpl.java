package com.curso.spring.thymeleaf.service;

import com.curso.spring.thymeleaf.domain.Funcionario;
import com.curso.spring.thymeleaf.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service @Transactional(readOnly = false)
public class FuncionarioServiceImpl implements FuncionarioService {

  @Autowired
  FuncionarioRepository funcionarioRepository;

  @Override
  public void salvar(Funcionario funcionario) {
    funcionarioRepository.save(funcionario);
  }

  @Override
  public void editar(Funcionario funcionario) {
    funcionarioRepository.saveAndFlush(funcionario);
  }

  @Override
  public void excluir(Long id) {
    funcionarioRepository.deleteById(id);
  }

  @Override @Transactional(readOnly = true)
  public Funcionario buscarPorId(Long id) {
    return funcionarioRepository.findById(id).orElseThrow(RuntimeException::new);
  }

  @Override @Transactional(readOnly = true)
  public List<Funcionario> buscarTodos() {
    return funcionarioRepository.findAll();
  }
}
