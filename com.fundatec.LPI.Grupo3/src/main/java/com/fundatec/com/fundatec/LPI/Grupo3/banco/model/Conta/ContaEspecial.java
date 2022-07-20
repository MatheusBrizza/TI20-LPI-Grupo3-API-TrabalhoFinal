package com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Conta;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "tbl_conta_especial")
@AllArgsConstructor
@NoArgsConstructor
public class ContaEspecial extends Conta{

    private BigDecimal limiteTransacoes = BigDecimal.valueOf(5);
}
