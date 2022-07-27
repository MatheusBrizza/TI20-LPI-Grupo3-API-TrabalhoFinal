package com.fundatec.com.fundatec.LPI.Grupo3.banco.Converter;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.DTO.ResponseBancoDTO;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.DTO.ResponseClienteDTO;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Banco;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Cliente;

public class ClienteConverter {
    public static ResponseClienteDTO converterParaResponse (Cliente cliente){
        ResponseClienteDTO responseClienteDTO= new ResponseClienteDTO();
        responseClienteDTO.setNome(cliente.getNome());
        responseClienteDTO.setCpf(cliente.getCpf());
        responseClienteDTO.setResponseEnderecoDTO(cliente.getEndereco());
        return responseClienteDTO;
    }
}
