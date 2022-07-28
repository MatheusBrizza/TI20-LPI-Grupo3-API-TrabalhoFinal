package com.fundatec.com.fundatec.LPI.Grupo3.banco.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Banco;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Conta;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.eenum.TiposDeContas;
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
