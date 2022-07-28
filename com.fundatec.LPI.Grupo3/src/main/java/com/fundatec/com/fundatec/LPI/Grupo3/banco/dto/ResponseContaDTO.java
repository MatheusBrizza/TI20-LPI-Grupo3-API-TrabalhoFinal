package com.fundatec.com.fundatec.LPI.Grupo3.banco.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
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
    private Long id;
    private String cpf;
    private ResponseBancoDTO banco;
    private List<ResponseMovimentacaoDTO> movimentacaoList;
    private BigDecimal saldo;
}
