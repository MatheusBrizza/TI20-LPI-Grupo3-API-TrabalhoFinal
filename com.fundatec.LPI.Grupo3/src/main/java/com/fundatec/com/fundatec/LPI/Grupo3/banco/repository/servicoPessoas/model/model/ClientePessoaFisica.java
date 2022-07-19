package com.fundatec.com.fundatec.LPI.Grupo3.banco.repository.servicoPessoas.model.model;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.repository.servicoPessoas.model.Pessoa;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@DiscriminatorValue("F")
public class ClientePessoaFisica extends Pessoa {
    @NotNull
    @Size(min = 11, max = 11)
    @Column(name = "cpf", unique = true)
    private String cpf;


    @NotNull
    @Size(min = 10, max = 10)
    @Column (name = "rg")
    private Integer rg;


}
