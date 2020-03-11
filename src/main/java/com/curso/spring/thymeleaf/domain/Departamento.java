package com.curso.spring.thymeleaf.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Table(name = "DEPARTAMENTOS")
@EqualsAndHashCode
@Data
@Entity
public class Departamento {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "nome", unique = true, length = 60, nullable = false)
  private String nome;

  @OneToMany(mappedBy = "departamento")
  private List<Cargo> cargos;

}
