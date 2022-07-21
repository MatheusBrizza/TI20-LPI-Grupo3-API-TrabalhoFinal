package com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Conta;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Pessoa.Cliente;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tbl_conta_poupanca")
@AllArgsConstructor
@NoArgsConstructor
public class ContaPoupanca extends Conta {
    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cp;

    @Column
    private Cliente cliente;

    @Column
    private final Double juros = 0.5;

    //Metodo calcula o juros de uma conta poupança
    public Double calcularJuros(){

    }

}
