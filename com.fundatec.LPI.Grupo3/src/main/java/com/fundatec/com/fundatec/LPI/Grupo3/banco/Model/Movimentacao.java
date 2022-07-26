package com.fundatec.com.fundatec.LPI.Grupo3.banco.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "conta_id")
    private Conta conta;
    @Column(name = "data_movimentacao")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/mm/yyyy")
    private LocalDate dataMovimentacao;

    @Column(name = "valor")
    private BigDecimal valor;
    //Tipo Operação como fazer?
    @Column(name = "tipo")
    private String tipo;

    public Movimentacao(Conta conta, BigDecimal valor, LocalDate dataMovimentacao,String tipo){
        this.conta = conta;
        this.valor = valor;
        this.dataMovimentacao = dataMovimentacao;
        this.tipo = tipo;
    }

}
