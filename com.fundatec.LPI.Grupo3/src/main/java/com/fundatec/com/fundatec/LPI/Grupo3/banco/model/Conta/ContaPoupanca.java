package com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Conta;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_conta_poupanca")
@AllArgsConstructor
@NoArgsConstructor
public class ContaPoupanca extends Conta {

    private final Double juros = 0.5;

}
