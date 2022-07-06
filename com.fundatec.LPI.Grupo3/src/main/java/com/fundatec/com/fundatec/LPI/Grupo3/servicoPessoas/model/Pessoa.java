package com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
@Entity
@Table(name = "pessoa")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", length = 1, discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("P")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;

    @NotNull
    @Column(name = "nome")
    private String nome;

    @NotNull
    @Column (name = "enderco")

    private Endereco Endereco;

    @NotNull
    @Column (name = "sexo")
    private Character sexo;

    @NotNull
    @Column (name = "data-nascimento")
    @JsonFormat (shape = JsonFormat.Shape.STRING, pattern = "dd/mm/yyyy")
    private LocalDate data_nascimento;

    @NotNull
    @Column(name = "data_cadastro")
    private LocalDate data_cadastro;

    @NotNull
    @Column(name = "estado_civil")
    private String estado_civil;

    @NotNull
    @Column(name = "profissao")
    private String profissao;

    @NotNull
    @Column(name = "Status")
    private Boolean status;

    @NotNull
    @Column(name = "Telefone")
    private Integer telefone;

    @NotNull
    @Column(name = "Email")
    private String email;

    @NotNull
    @Column(name = "Cargo")
    private Integer cargo;

    @NotNull
    @Column(name = "Especialidade")
    private Integer especialidade;
    @OneToOne
    private Endereco endereco;
}
