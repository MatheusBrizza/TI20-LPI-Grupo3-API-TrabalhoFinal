package com.fundatec.com.fundatec.LPI.Grupo3.banco.Converter.Impl;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.RequestDTO.RequestClienteDTO;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Converter.ConverterCliente;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Cliente;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.ResponseDTO.ResponseClienteDTO;
import org.springframework.stereotype.Component;

@Component
public class ConverterClienteImpl implements ConverterCliente  <Cliente, ResponseClienteDTO, ResponseClienteDTO>{
    @Override
    public ResponseClienteDTO converter(Cliente cliente){
        return ResponseClienteDTO.builder().id(cliente.getId())
                .nome(cliente.getNome())
                .endereco(cliente.getEndereco()) //Como verificar se está nulo ou não
                .build();
    }
    @Override
    public Cliente converterCliente(RequestClienteDTO clienteDTO){
        return Cliente.builder()
                .nome(clienteDTO.getNome())
                .cpf(clienteDTO.getCpf())
                .build();

    }
}
