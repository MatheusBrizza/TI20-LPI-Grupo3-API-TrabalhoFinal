package com.fundatec.com.fundatec.LPI.Grupo3.banco.service;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.converter.ClienteConverter;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.dto.ResponseClienteDTO;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.repository.ClienteRepository;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {
    //Injetando a dependencia
    @Autowired
    private ClienteRepository clienteRepository;
    //Adicionar EnderecoService enderecoService;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    //Salvar
    public ResponseClienteDTO salvarCliente(Cliente cliente){

        return ClienteConverter.converterParaResponse(clienteRepository.save(cliente));
    }
    //Deletar
    public void deletarClienteById(Long id){
clienteRepository.deleteById(id);
    }

    //Cadastrando novo cliente
    public ResponseClienteDTO cadastrarNovoCliente(Cliente cliente){

        return ClienteConverter.converterParaResponse(clienteRepository.save(cliente));
    }
    //Listar todos os clientes
    public Iterable <Cliente> findAll(){

        return clienteRepository.findAll();
    }

    //Listar por Id
    public Optional<Cliente> findById(Long id){

        return clienteRepository.findById(id);
    }

}
