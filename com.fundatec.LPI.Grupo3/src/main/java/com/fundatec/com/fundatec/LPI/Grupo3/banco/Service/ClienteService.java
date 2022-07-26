package com.fundatec.com.fundatec.LPI.Grupo3.banco.Service;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.Repository.ClienteRepository;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ClienteService {
    //Injetando a dependencia
    @Autowired
    private ClienteRepository clienteRepository;
    //Adicionar EnderecoService enderecoService;

    //Salvar
    public Cliente salvarCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }
    //Deletar
    public void deletarClienteById(Long id){
        clienteRepository.deleteById(id);
    }

    //Cadastrando novo cliente
    public Cliente cadastrarNovoCliente(Cliente cliente){

        return clienteRepository.save(cliente);
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
