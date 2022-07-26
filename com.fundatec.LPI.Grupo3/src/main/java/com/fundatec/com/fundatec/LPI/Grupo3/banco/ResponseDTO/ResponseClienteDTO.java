package com.fundatec.com.fundatec.LPI.Grupo3.banco.ResponseDTO;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Banco;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Endereco;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//Devolve ao solicitante
@Data
@Builder
@Getter
@Setter
public class ResponseClienteDTO {
    private String nome;
    private Endereco endereco;
    private Banco banco;


}
