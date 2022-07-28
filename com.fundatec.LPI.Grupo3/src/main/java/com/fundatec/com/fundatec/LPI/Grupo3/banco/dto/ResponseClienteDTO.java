package com.fundatec.com.fundatec.LPI.Grupo3.banco.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Endereco;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Builder
@Data
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseClienteDTO {

    private Long id;
    private String nome;
    private String cpf;
    private Endereco endereco;
}
