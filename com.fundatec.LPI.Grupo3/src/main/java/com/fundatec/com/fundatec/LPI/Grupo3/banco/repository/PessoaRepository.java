package com.fundatec.com.fundatec.LPI.Grupo3.banco.repository;

import com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.model.Pessoa;

import java.util.List;

public interface PessoaRepository {
    List<Pessoa> findAll();
}
