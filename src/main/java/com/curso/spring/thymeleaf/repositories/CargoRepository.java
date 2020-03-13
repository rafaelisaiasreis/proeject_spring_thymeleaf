package com.curso.spring.thymeleaf.repositories;

import com.curso.spring.thymeleaf.domain.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Long> {
}
