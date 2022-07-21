package com.fundatec.com.fundatec.LPI.Grupo3.banco.repository;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Conta.Conta;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Conta.Transacao;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TransacaoRepository extends CrudRepository <Transacao, Long > {
   List<Transacao> findByConta(Conta conta);
}
