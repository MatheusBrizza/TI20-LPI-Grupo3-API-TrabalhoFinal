package com.fundatec.com.fundatec.LPI.Grupo3.banco.service;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Conta;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.repository.ClienteRepository;

public class ClienteService {
    private final ClienteRepository clienteRepository;


    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
    public Conta criar (String cpf){
    }
}
