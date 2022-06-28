package com.fundatec.com.fundatec.LPI.Grupo3.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fundatec.com.fundatec.LPI.Grupo3.enums.TipoMovimentacao;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Calendar;

@Entity
@Table(name = "movimentacao")
public class Movimentacao {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/mm/yyyy")
    private Calendar data;

    @Column(name = "tipo_movimentacao")
    @Enumerated(EnumType.STRING)
    private TipoMovimentacao tipoMovimentacao;

    @NotNull
    @Column(name = "valor", columnDefinition = " Decimal(10,2) default '100.00'")
    private Double valor;

    @ManyToOne
    @JoinColumn(name = "conta_de_origen_id", foreignKey = @ForeignKey(name = "FK_conta_origem"))
    private Conta contaOrigem;

    @ManyToOne
    @JoinColumn(name = "conta_de_destino_id", foreignKey = @ForeignKey(name = "FK_conta_destino"))
    private Conta contaDestino;

}
