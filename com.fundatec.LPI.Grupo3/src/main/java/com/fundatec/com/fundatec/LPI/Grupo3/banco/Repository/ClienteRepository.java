package com.fundatec.com.fundatec.LPI.Grupo3.banco.Repository;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
