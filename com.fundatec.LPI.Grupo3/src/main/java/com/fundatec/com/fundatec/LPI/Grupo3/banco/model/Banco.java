package com.fundatec.com.fundatec.LPI.Grupo3.banco.model;

import lombok.AllArgsConstructor;
import lombok.Builder;

import javax.persistence.*;
import java.util.Optional;

@Entity
@Builder
@Table

public class Banco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name= "id_banco")
    private id_banco;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "banco")
    private Optional <Conta> contas;

}
