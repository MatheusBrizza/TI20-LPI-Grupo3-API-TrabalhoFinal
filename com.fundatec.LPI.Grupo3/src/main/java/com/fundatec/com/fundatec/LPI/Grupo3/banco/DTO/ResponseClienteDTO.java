package com.fundatec.com.fundatec.LPI.Grupo3.banco.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
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
    private ResponseEnderecoDTO responseEnderecoDTO;
}
