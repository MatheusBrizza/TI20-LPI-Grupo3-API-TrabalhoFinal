package com.fundatec.com.fundatec.LPI.Grupo3.banco.Controller;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Cliente;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping
@AllArgsConstructor
@RestController
public class ClienteController {
    @Autowired
    ClienteRepository clienteRepository;

    //METODO GET
    @GetMapping
    public List<Cliente> listarClientes(){
        return clienteRepository.findAll();
    }
    // Buscar
    @GetMapping
    public ResponseEntity<Cliente> buscar(@PathVariable Long id){
        return clienteRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    //METODO POST
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente adicionar(@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);
    }
    //METODO PUT
    @PutMapping()
    public ResponseEntity<Cliente> atualizar(@PathVariable Long id, @RequestBody Cliente cliente){
        if (!clienteRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        cliente.setId(id);
        cliente = clienteRepository.save(cliente);
        return ResponseEntity.ok(cliente);
    }
    @DeleteMapping
    public ResponseEntity<Void> remover(@PathVariable Long id){
        if (!clienteRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        clienteRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
