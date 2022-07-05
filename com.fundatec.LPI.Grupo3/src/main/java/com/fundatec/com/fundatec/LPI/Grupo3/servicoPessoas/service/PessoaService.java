package com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.service;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.repository.PessoaRepository;
import com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.model.Pessoa;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class PessoaService {

    private final PessoaRepository repository;

    public PessoaServiceImpl(PessoaRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Pessoa> get() {
        return repository.findAll();
    }

    @Override
    public Optional<Pessoa> get(Long id) {
        return repository.findById(id);
    }

    @Override
    public Pessoa save(Pessoa pessoa) {
        return repository.save(pessoa);
    }

    @Override
    public Optional<Pessoa> update(Pessoa pessoa) {
                    return repository.save(pessoa);
                });
    }

    @Override
    public void deleteByID(Long id) {
        Optional<Pessoa> pessoa = get(id);

        if(!pessoa.isPresent()) {
            repository.deleteById(id);
        } else {
            throw new PessoaNotFoundException(id);
        }
    }
}
