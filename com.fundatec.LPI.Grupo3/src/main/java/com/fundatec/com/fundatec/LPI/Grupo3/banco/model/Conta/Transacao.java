package com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Conta;

import javax.persistence.*;
import java.time.LocalDate;

/*Classe Transação representa a movimentação em uma conta bancária */
@Entity
@Table
public class Transacao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_Transacao;

    @ManyToOne
    private Conta conta;

    @Column
    private Double valor;

    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private LocalDate dataTransacao;

}
