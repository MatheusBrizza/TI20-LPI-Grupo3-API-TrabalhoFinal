package com.fundatec.com.fundatec.LPI.Grupo3.banco.converter;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.dto.ResponseClienteDTO;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Cliente;

public class ClienteConverter {
    public static ResponseClienteDTO converterParaResponse (Cliente cliente){
        ResponseClienteDTO responseClienteDTO= new ResponseClienteDTO();
        responseClienteDTO.setNome(cliente.getNome());
        responseClienteDTO.setCpf(cliente.getCpf());
        responseClienteDTO.setEndereco(cliente.getEndereco());
        return responseClienteDTO;
    }
}
