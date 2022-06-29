package com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.service;
import com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.model.Pessoa;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class PessoaService {

    private final pessoaRepository repository;

    public pessoaService(pessoaRepository repository) {
        this.repository = repository;

    }
    @PostMapping
    public Pessoa salvar(Pessoa pessoa) {
        return repository.save(pessoa);
    }

    // Buscar por nome
    public Optional <Pessoa> findByNome(String nome) {
        return repository.findByNome(nome);
    }
    //Buscar por Profissão
    public Optional <Pessoa> findByProfissao(String profissao) {
        return repository.findByProfissao(profissao);
    }
    public Optional <Pessoa> findByStatus(Boolean status) {
        return repository.findByStatus(status);
    }
    //Buscar todos//
    public Iterable<Pessoa> findAll() {
        return repository.findAll();
    }
}
