package com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
@RestController
@RequestMapping("/")
public class PessoaFisicaDTO {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;

    @NotNull
    @Column(name = "nome")
    private String nome;

    @NotNull
    @Column (name = "endereco")
    @OneToOne
    private com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.model.Endereco Endereco;

    @NotNull
    @Column (name = "data-nascimento")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/mm/yyyy")
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
}
