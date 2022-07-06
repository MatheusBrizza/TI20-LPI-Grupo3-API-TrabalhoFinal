package com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.model;

import com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.model.Pessoa;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Cliente extends Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pessoa;
}
