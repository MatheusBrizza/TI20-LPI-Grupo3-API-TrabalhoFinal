package com.fundatec.com.fundatec.LPI.Grupo3.banco.model;

import com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.model.Pessoa;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@DiscriminatorValue("J")
public class ClientePessoaJuridica extends Pessoa {
    @NotNull
    @Size(min = 14, max = 14)
    @Column(name = "cnpj", unique = true)
    private String cnpj;
}
