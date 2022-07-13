package com.fundatec.com.fundatec.LPI.Grupo3.banco.service;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.ClientePessoaJuridica;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.repository.ClientePessoaFisicaRepository;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.repository.ClientePessoaJuridicaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientePessoaJuridicaService {

    private final ClientePessoaJuridicaRepository repository;

    public ClientePessoaJuridicaService(ClientePessoaJuridicaRepository repository) {
        this.repository = repository;
    }

    public ClientePessoaJuridica save(ClientePessoaJuridica clientePessoaJuridica) {
        return (ClientePessoaJuridica) repository.save(clientePessoaJuridica);
    }

    public Optional<ClientePessoaJuridica> findById(Integer id) {
        return repository.findById(id);
    }

    public Iterable<ClientePessoaJuridica> findAll() {
        return repository.findAll();
    }

    public void delete(Integer id) {
        repository.delete(id);
    }
}
