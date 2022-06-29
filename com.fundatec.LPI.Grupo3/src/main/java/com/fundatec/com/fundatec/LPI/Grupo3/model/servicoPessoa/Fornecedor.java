package com.fundatec.com.fundatec.LPI.Grupo3.model.servicoPessoa;

import com.fundatec.com.fundatec.LPI.Grupo3.model.servicoPessoa.Pessoa;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
@Entity
public class Fornecedor extends Pessoa {

    private Integer id_pessoa;
    private Integer id_telefone;
    private Integer id_email;
    @OneToOne
    private Endereco endereco;
}
