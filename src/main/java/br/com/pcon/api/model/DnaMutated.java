package br.com.pcon.api.model;

import javax.validation.constraints.NotEmpty;

public class DnaMutated {

  @NotEmpty
  private String dna;

  private long mutationDegree;

}
