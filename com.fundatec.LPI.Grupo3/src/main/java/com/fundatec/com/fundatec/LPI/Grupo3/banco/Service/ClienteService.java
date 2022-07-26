package com.fundatec.com.fundatec.LPI.Grupo3.banco.Service;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.Repository.ClienteRepository;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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
    public List <Cliente> findAll(){
        return clienteRepository.findAll();
    }

    //Listar por Id
    public List<Cliente> findById(){
        return clienteRepository.findById();
    }

}
