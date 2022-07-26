package com.fundatec.com.fundatec.LPI.Grupo3.banco.Model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
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
    private Long id;
    private Conta conta;
    private LocalDate dataMovimentacao;
    private BigDecimal valor;
    //Tipo Operação como fazer?

    public Movimentacao(Conta conta, BigDecimal valor, LocalDate dataMovimentacao){
        this.conta = conta;
        this.valor = valor;
        this.dataMovimentacao = dataMovimentacao;
    }

    //???
    @Override
    public String toString(){
        return
    }
}
