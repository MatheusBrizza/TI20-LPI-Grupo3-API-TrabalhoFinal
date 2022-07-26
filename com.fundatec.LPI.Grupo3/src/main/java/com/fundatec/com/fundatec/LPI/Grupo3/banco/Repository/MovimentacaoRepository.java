package com.fundatec.com.fundatec.LPI.Grupo3.banco.Repository;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Conta;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Movimentacao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovimentacaoRepository extends CrudRepository<Movimentacao,Long> {
 List<Movimentacao> findByConta(Conta conta);
}
