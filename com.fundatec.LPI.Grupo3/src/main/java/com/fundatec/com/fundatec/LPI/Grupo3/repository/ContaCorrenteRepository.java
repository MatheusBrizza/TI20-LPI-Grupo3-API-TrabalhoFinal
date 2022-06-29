package com.fundatec.com.fundatec.LPI.Grupo3.repository;

import com.fundatec.com.fundatec.LPI.Grupo3.model.banco.ContaCorrente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaCorrenteRepository extends JpaRepository<ContaCorrente, Long> {

    public ContaCorrente findByNumero(String num);

    public ContaCorrente findFirstByOrderById();

    public ContaCorrente findFirstByOrderByIdDesc();
}
