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
}
    @Override
    public List<Pessoa> get() {

    return repository.findAll();
    }

    @Override
    public Pessoa save(Pessoa pessoa) {
        return repository.save(pessoa);
    }


    @Override
    public Optional<Pessoa> update(Pessoa pessoa) {
        return repository.save(pessoa);
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


