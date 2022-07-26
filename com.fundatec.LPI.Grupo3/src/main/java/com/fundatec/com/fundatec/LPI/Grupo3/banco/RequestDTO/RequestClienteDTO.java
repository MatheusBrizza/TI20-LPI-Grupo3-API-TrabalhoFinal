package com.fundatec.com.fundatec.LPI.Grupo3.banco.RequestDTO;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Banco;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Endereco;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
//@JsonInclude
public class RequestClienteDTO {
    private Long id;
    private String nome;
    private String cpf;
    private Endereco endereco;
    private Banco banco;

    //Construtor vazio

    //Construtor que vai me devolver um cliente

}
