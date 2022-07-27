package com.fundatec.com.fundatec.LPI.Grupo3.banco.Service;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.Converter.ClienteConverter;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.DTO.ResponseClienteDTO;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Repository.ClienteRepository;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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

        ClienteConverter.converterParaResponse(clienteRepository.deleteById(id));
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
