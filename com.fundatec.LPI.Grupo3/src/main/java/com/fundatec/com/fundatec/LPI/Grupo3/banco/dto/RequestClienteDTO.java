package com.fundatec.com.fundatec.LPI.Grupo3.banco.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Endereco;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Builder
@Data
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestClienteDTO {
    private String nome;
    private String cpf;
    private Endereco endereco;
    private String genero;
    private LocalDate dataNascimento;
}
