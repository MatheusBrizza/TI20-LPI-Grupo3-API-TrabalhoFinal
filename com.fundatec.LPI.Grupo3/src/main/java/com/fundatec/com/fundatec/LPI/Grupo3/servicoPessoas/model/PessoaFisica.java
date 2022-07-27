package com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Table(name = "pessoa_fisica")
public class PessoaFisica extends Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_pessoa;

    @NotNull
    @Column(name = "nome")
    private String nome;

    @NotNull
    @Column (name = "enderco")
    @OneToOne
    private Endereco Endereco;

    @NotNull
    @Column(name = "data_cadastro")
    private LocalDate data_cadastro;

    @NotNull
    @Column(name = "Status")
    private Boolean status;

    @NotNull
    @Column(name = "Cargo")
    private Integer cargo;

    @NotNull
    @Column(name = "Especialidade")
    private Integer especialidade;
}
