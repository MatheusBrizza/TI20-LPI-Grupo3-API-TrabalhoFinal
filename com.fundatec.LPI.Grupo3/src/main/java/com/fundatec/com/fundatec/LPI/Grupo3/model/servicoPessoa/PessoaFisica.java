package com.fundatec.com.fundatec.LPI.Grupo3.model.servicoPessoa;

import com.fundatec.com.fundatec.LPI.Grupo3.model.servicoPessoa.Pessoa;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@DiscriminatorValue("F")
public class PessoaFisica extends Pessoa {
    @NotNull
    @Size(min = 11, max = 11)
    @Column(name = "cpf", unique = true)
    private String cpf;
}
