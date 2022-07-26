package com.fundatec.com.fundatec.LPI.Grupo3.banco.Model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Builder
@Table(name = "Movimentacoes")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Movimentacao {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "Conta_id")
    private Conta conta;
    private LocalDate dataMovimentacao;
    private BigDecimal valor;
    //Tipo Operação como fazer?
    private String tipo;

    public Movimentacao(Conta conta, BigDecimal valor, LocalDate dataMovimentacao,String tipo){
        this.conta = conta;
        this.valor = valor;
        this.dataMovimentacao = dataMovimentacao;
        this.tipo = tipo;
    }

}
