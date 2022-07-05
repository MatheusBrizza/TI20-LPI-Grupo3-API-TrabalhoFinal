package com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.service;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.repository.PessoaRepository;
import com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.model.Pessoa;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.List;
import java.util.Optional;
@Service
public class PessoaService {

    private final PessoaRepository repository;

    public PessoaService(PessoaRepository repository) {
        this.repository = repository;
    }
    public Optional<Pessoa> findById(Long id) {

        return repository.findById(id);
    }
    public Iterable<Pessoa> findAll() {

    return repository.findAll();
    }

    public Pessoa save(Pessoa pessoa) {
        return repository.save(pessoa);
    }


    public Pessoa update(Pessoa pessoa) {
        return repository.save(pessoa);
    }

    public void deleteByID(Long id) {
            repository.deleteById(id);
    }
}


