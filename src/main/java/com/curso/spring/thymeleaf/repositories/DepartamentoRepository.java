package com.curso.spring.thymeleaf.repositories;

import com.curso.spring.thymeleaf.domain.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {
}
