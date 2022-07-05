package com.fundatec.com.fundatec.LPI.Grupo3.banco.repository;

import com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.model.Pessoa;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PessoaRepository extends CrudRepository<Pessoa, Long> {
    @Override
    Optional<Pessoa> findById(Long id);

}
