package com.fundatec.com.fundatec.LPI.Grupo3.banco.Controller;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Cliente;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.ResponseDTO.ResponseClienteDTO;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Repository.ClienteRepository;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/v1/clientes")
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;
    private ClienteService clienteService;

    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    //METODO GET
    @GetMapping
    public Iterable<Cliente> listarClientes(){
        return clienteService.findAll();
    }
    // Buscar
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarClientePorId(@PathVariable Long id){
        return clienteRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    //METODO POST
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente adicionarCliente(@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);
    }
    //METODO PUT
    @PutMapping()
    public ResponseEntity<Cliente> atualizarCliente(@PathVariable Long id, @RequestBody Cliente cliente){
        if (!clienteRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        Cliente clienteParaAtualizar = clienteService.findById(id).get();
        clienteParaAtualizar.setBanco(cliente.getBanco());
        clienteParaAtualizar.setNome(cliente.getNome());
        clienteParaAtualizar.setCpf(cliente.getCpf());
        clienteParaAtualizar.setEndereco(cliente.getEndereco());
        clienteParaAtualizar.setData_nascimento(cliente.getData_nascimento());
        clienteParaAtualizar.setGenero(cliente.getGenero());
        clienteService.salvarCliente(clienteParaAtualizar);
        return ResponseEntity.ok(clienteParaAtualizar);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id){
        if (!clienteRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        clienteRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
