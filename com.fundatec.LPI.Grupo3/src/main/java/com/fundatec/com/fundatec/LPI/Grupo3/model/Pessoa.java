package com.fundatec.com.fundatec.LPI.Grupo3.model;

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
    @Column (name ="cpf")
    private Integer cpf;

    @NotNull
    @Column (name ="cnpj")
    private Integer cnpj;

    @NotNull
    @Column (name = "inscricao_Estadual")
    private Integer inscEstadual;

    @NotNull
    @Column (name = "rg")
    private Integer rg;

    @NotNull
    @Column (name = "enderco")
    private String Endereco;

    @NotNull
    @Column (name = "cep")
    private Integer cep;

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
    private String Status;

    @NotNull
    @Column (name = "cidade")
    private id_cidade id_cidade;

    @NotNull
    @Column(name = "uf")
    private id_uf id_uf;

    @NotNull
    @Column(name = "bairro")
    private id_bairro id_bairro;
}
