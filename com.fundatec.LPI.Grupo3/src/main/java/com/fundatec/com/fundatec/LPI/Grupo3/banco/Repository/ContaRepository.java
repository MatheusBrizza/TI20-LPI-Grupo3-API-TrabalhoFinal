package com.fundatec.com.fundatec.LPI.Grupo3.banco.Repository;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Conta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContaRepository extends CrudRepository <Conta, Long> {
    Conta findByCpf(String cpf);

    Iterable<Conta> listarTodasContas();
}
