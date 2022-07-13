package com.fundatec.com.fundatec.LPI.Grupo3.banco.service;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.ClientePessoaFisica;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.ClientePessoaJuridica;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.repository.ClientePessoaFisicaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientePessoaFisicaService {

    private final ClientePessoaFisicaRepository repository;

    public ClientePessoaFisicaService(ClientePessoaFisicaRepository repository) {

        this.repository = repository;

    }

    public ClientePessoaFisica save(ClientePessoaFisica clientePessoaFisica) {
        return (ClientePessoaFisica) repository.save(clientePessoaFisica);
    }

    public Optional<ClientePessoaFisica> findById(Integer id) {
        return repository.findById(id);
    }

    public Iterable<ClientePessoaFisica> findAll() {
        return repository.findAll();
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
