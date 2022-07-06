package com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.DTO;

import com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.model.Endereco;

import javax.persistence.Column;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class ProfissionalDTO {



    @NotNull
    @Column(name = "nome")
    private String nome;

    @NotNull
    @Column (name = "enderco")
    @OneToOne
    private com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.model.Endereco Endereco;

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
