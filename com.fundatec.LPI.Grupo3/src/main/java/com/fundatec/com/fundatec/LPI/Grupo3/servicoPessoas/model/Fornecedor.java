package com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.model;

import javax.persistence.*;

@Entity
public class Fornecedor extends Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_pessoa;
}
