package com.curso.spring.thymeleaf.service;

import com.curso.spring.thymeleaf.domain.Cargo;
import com.curso.spring.thymeleaf.repositories.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service @Transactional(readOnly = false)
public class CargoServiceImpl implements CargoService {

  @Autowired
  CargoRepository cargoRepository;

  @Override
  public void salvar(Cargo cargo) {
    cargoRepository.save(cargo);
  }

  @Override
  public void editar(Cargo cargo) {
    cargoRepository.saveAndFlush(cargo);
  }

  @Override
  public void excluir(Long id) {
    cargoRepository.deleteById(id);
  }

  @Override @Transactional(readOnly = true)
  public Cargo buscarPorId(Long id) {
    return cargoRepository.findById(id).orElseThrow(RuntimeException::new);
  }

  @Override @Transactional(readOnly = true)
  public List<Cargo> buscarTodos() {
    return cargoRepository.findAll();
  }
}
