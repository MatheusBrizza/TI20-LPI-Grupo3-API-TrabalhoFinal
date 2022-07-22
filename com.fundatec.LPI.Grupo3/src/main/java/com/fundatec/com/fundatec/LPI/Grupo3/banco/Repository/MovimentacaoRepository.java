package com.fundatec.com.fundatec.LPI.Grupo3.banco.Repository;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Conta;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Movimentacao;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MovimentacaoRepository extends CrudRepository<Movimentacao,Long> {
 List<Movimentacao> findByConta(Conta conta);
}
