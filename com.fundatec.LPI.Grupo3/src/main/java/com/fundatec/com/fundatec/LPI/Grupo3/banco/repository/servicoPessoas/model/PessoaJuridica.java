package com.fundatec.com.fundatec.LPI.Grupo3.banco.repository.servicoPessoas.model;

import javax.persistence.*;

@Entity
public class PessoaJuridica extends Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_pessoa;

}
