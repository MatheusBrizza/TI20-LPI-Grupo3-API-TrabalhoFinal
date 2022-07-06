package com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.model;

import com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.model.Pessoa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Profissional extends Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_pessoa;


}
