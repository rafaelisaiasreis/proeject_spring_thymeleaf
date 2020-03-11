package com.curso.spring.thymeleaf.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Table(name = "DEPARTAMENTOS")
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Departamento extends AbstractEntity<Long> {

  @Column(name = "nome", unique = true, length = 60, nullable = false)
  private String nome;

  @OneToMany(mappedBy = "departamento")
  private List<Cargo> cargos;

}
