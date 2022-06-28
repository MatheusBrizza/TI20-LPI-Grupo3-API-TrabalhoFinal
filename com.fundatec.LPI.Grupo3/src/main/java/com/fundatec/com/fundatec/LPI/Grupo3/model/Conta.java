package com.fundatec.com.fundatec.LPI.Grupo3.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "conta")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", length = 2, discriminatorType = DiscriminatorType.STRING)
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @NotNull
    @Column( name = "numero", unique = true)
    private String numero;

    @NotNull
    @Column(name = "senha", unique = true)
    private String senha;

    @NotNull
    @Column(name = "saldo", columnDefinition = "Decimal(10,2) default '100.00'")
    private Double saldo;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "agencia_id")
    private Agencia agencia;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;


}
