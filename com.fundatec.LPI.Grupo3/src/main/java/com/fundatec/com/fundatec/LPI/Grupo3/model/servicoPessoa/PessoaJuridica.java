package com.fundatec.com.fundatec.LPI.Grupo3.model.servicoPessoa;

import com.fundatec.com.fundatec.LPI.Grupo3.model.servicoPessoa.Pessoa;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@DiscriminatorValue("J")
public class PessoaJuridica extends Pessoa {
    @NotNull
    @Size(min = 14, max = 14)
    @Column(name = "cnpj", unique = true)
    private String cnpj;

    @NotNull
    @Size(min = 10, max = 12)
    @Column (name = "inscricao_Estadual")
    private Integer inscEstadual;


}
