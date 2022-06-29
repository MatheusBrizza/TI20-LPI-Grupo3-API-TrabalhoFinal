package com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "pessoa")
public class Endereco {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @NotNull
        @Column(name = "UF")
        private String uf;

        @NotNull
        @Column(name = "cidade")
        private String cidade;

        @NotNull
        @Column(name = "bairro")
        private String bairro;

        @NotNull
        @Column(name = "rua")
        private String rua;

        @NotNull
        @Column(name = "compl")
        private String complemento;

        @NotNull
        @Column(name = "CEP")
        private Integer cep;

}

