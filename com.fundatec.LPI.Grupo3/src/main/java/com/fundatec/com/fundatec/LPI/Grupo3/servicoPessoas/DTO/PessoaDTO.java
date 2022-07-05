package com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.DTO;

import com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.model.Endereco;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
@Data
public class PessoaDTO {
    private Long id;
    @NotNull(message = "Um nome deve ser informado!")
    private String nome;

    @NotNull(message = "Um endereço deve ser informado!")
    private Endereco endereco;

    @NotNull(message = "Uma data de cadastro deve ser informada!")
    private LocalDate data_cadastro;

    @NotNull(message = "O status do cliente deve ser informado")
    private Boolean status;
}
