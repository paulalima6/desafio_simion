package br.com.pcon.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Individual {

  @Id
  @GeneratedValue
  private Long id;

  @Column(name = "dna_id")
  private Long dnaId;

  private String name;

  private String sex;

  private String address;

  private String marriageStatus;

}
