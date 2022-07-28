package com.fundatec.com.fundatec.LPI.Grupo3.banco.repository;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Conta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends CrudRepository <Conta, Long> {
    Conta findByCpf(String cpf);

    Iterable<Conta> listarTodasContas();
}
