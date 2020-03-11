package com.curso.spring.thymeleaf.domain;

import com.curso.spring.thymeleaf.enums.UF;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@EqualsAndHashCode
@Table(name = "ENDERECOS")
@Entity
@Data
public class Endereco {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "logradouro")
  @NotNull
  private String logradouro;

  @Column(name = "bairro")
  @NotNull
  private String bairro;

  @Column(name = "cidade")
  @NotNull
  private String cidade;

  @Column(name = "uf")
  @NotNull
  @Length(max = 2)
  @Enumerated(EnumType.STRING)
  private UF uf;

  @Column(name = "cep", nullable = false, length = 9)
  private String cep;

  @Column(name = "numero", nullable = false, length = 5)
  private Integer numero;

  @Column(name = "complemento")
  private String complemento;

}
