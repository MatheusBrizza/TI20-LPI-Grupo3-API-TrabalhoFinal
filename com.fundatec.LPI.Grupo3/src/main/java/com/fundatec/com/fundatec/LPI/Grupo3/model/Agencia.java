package com.fundatec.com.fundatec.LPI.Grupo3.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "agencia")
public class Agencia {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private  Long id;

    @NotNull
    @Column(name = "nome")
    private String nome;

    @NotNull
    @Size(min = 5, max = 5)
    @Column( name = "codigo", unique = true)
    private String codigo;

    @OneToOne(mappedBy = "agencia", cascade = CascadeType.ALL)
    private Endereco endereco;

    @OneToMany(mappedBy = agencia, cascade = CascadeType.ALL)
    private List<Conta> conta;


}
