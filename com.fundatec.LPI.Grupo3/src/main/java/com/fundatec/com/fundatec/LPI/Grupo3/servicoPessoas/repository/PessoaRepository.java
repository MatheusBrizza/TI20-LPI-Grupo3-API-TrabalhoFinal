package com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.repository;

import com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.model.Pessoa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Long> {
    @Override
Optional<Pessoa> findById(Long, id);
}
