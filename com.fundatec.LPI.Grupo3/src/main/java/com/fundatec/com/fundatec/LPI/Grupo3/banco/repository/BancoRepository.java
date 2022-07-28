package com.fundatec.com.fundatec.LPI.Grupo3.banco.repository;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Banco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BancoRepository extends CrudRepository <Banco, Long> {

}
