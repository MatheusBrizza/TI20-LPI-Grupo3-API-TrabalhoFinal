package com.fundatec.com.fundatec.LPI.Grupo3.banco.repository;

import com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.model.model.Conta;
import com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.model.model.ContaCorrente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository extends JpaRepository<Conta, Long> {

}
