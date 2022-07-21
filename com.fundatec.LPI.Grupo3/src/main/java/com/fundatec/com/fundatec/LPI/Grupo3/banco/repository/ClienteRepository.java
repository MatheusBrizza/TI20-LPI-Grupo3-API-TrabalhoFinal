package com.fundatec.com.fundatec.LPI.Grupo3.banco.repository;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Pessoa.Cliente;
import com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.model.Pessoa;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ClienteRepository extends CrudRepository<Pessoa, Long> {
    @Override
    Optional<Pessoa> findById(Long id);

    //Pesquisa por nome
    List<Cliente> findByNome(String nome);

    Optional<Cliente> findById(ClienteRepository clienteRepository);

}
