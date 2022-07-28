package com.fundatec.com.fundatec.LPI.Grupo3.banco.repository;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Conta;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Movimentacao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovimentacaoRepository extends CrudRepository<Movimentacao,Long> {
 List<Movimentacao> findByConta(Conta conta);
}
