package com.curso.spring.thymeleaf.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Table(name = "CARGOS")
@EqualsAndHashCode
@Data
@Entity
public class Cargo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "nome", nullable = false, unique = true, length = 60)
  private String nome;

  @ManyToOne
  @JoinColumn(name = "id_departamento_fk")
  private Departamento departamento;

  @OneToMany(mappedBy = "cargo")
  private List<Funcionario> funcionarios;

}
