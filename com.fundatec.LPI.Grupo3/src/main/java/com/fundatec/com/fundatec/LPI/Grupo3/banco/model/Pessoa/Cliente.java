package com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Pessoa;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.enums.StatusDaConta;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Banco;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Conta.Conta;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
@Entity
@Data
@Builder
public class Cliente {
    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cliente;

    @Column
    private String nome;
    @Column
    @OneToMany
    private Conta conta;
}
