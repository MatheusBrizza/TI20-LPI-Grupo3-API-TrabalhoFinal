package com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Conta;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_conta_simples")
@AllArgsConstructor
@NoArgsConstructor
public class ContaSimples extends Conta {

}
