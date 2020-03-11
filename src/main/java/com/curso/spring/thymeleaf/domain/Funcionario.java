package com.curso.spring.thymeleaf.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Table(name = "FUNCIONARIOS")
@EqualsAndHashCode
@Entity
@Data
public class Funcionario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "nome", nullable = false, unique = true)
  private String nome;

  @Column(name = "salario", nullable = false, columnDefinition = "DECIMAL(7,2) DEFAULT 0.00")
  private BigDecimal salario;

  @Column(name = "data_entrada", columnDefinition = "DATE")
  private LocalDate dataEntrada;

  @Column(name = "data_saida", columnDefinition = "DATE")
  private LocalDate dataSaida;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "endereco_id_fk")
  private Endereco endereco;

  @ManyToOne
  @JoinColumn(name = "cargo_id_fk")
  private Cargo cargo;

}
