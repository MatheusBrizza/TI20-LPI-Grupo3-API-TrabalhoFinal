package com.fundatec.com.fundatec.LPI.Grupo3.banco.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Banco;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Conta;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Enum.TiposDeContas;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Builder
@Data
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestContaDTO {
    private Conta conta;
    private Banco banco;
    private TiposDeContas tiposDeContas;
    private String senha;
}
