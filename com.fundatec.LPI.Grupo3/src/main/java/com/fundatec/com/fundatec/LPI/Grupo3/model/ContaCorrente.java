package com.fundatec.com.fundatec.LPI.Grupo3.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
@DiscriminatorValue(value = "CC")
public class ContaCorrente extends Conta{
    @Column(name = "limite_contacorrente", columnDefinition = "Decimal(10,2) default '100.00'")
    private Double limite_contacorrente;

    @NotNull
    @Column(name = "taxa_servicos", columnDefinition = "Decimal(10,2) default '100.00")
    private Double taxa_serviços;
}
