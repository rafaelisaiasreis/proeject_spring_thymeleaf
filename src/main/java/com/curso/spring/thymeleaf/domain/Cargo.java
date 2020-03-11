package com.curso.spring.thymeleaf.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "CARGOS")
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Cargo extends AbstractEntity<Long> {

  @Column(name = "nome", nullable = false, unique = true, length = 60)
  private String nome;

  @ManyToOne
  @JoinColumn(name = "id_departamento_fk")
  private Departamento departamento;

}
