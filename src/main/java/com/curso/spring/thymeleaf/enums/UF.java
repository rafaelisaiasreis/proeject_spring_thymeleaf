package com.curso.spring.thymeleaf.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum UF {

  AC("AC", "Acre"),
  AL("AL", "Alagoas"),
  AM("AM", "Amazonas"),
  BA("BA", "Bahia"),
  CE("CE", "Ceara"),
  DF("DF", "Distrito Federal"),
  ES("ES", "Espi­rito Santo"),
  GO("GO", "Goias"),
  MA("MA", "Maranhao"),
  MT("MT", "Mato Grosso"),
  MS("MS", "Mato Grosso do Sul"),
  MG("MG", "Minas Gerais"),
  PA("PA", "Para"),
  PB("PB", "Parai­ba"),
  PR("PR", "Parana"),
  PE("PE", "Pernambuco"),
  PI("PI", "Piaui­"),
  RJ("RJ", "Rio de Janeiro"),
  RN("RN", "Rio Grande do Norte"),
  RS("RS", "Rio Grande do Sul"),
  RO("RO", "Rondonia"),
  RR("RR", "Roraima"),
  SC("SC", "Santa Catarina"),
  SP("SP", "Sao Paulo"),
  SE("SE", "Sergipe"),
  TO("TO", "Tocantins");

  @Getter
  private String sigla;
  @Getter
  private String descricao;

}
