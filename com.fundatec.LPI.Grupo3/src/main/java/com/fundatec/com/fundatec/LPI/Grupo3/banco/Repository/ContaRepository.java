package com.fundatec.com.fundatec.LPI.Grupo3.banco.Repository;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Conta;
import org.springframework.data.repository.CrudRepository;

public interface ContaRepository extends CrudRepository <Conta, Long id> {
        Optional<Conta> findByCpf(String cpf);
        List<Conta> listaTodasContas()
}
