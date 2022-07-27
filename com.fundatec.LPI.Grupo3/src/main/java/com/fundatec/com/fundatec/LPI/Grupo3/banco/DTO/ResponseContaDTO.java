package com.fundatec.com.fundatec.LPI.Grupo3.banco.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Cliente;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Enum.StatusDaConta;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Builder
@Getter
@Setter
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseContaDTO {
    private StatusDaConta statusDaConta;
    private Cliente cliente;
    private BigDecimal saldo;
}