package com.fundatec.com.fundatec.LPI.Grupo3.banco.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseMovimentacaoDTO {
    private Long id;
    private BigDecimal valor;
    private LocalDateTime dataMovimentacao;
}
