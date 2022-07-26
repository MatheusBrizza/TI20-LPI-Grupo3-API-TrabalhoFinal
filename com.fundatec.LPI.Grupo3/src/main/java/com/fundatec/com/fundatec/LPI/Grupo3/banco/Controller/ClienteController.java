package com.fundatec.com.fundatec.LPI.Grupo3.banco.Controller;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.ResponseDTO.ResponseClienteDTO;
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
    public List<ResponseClienteDTO> listarClientes(){
        return clienteRepository.findAll();
    }
    // Buscar
    @GetMapping
    public ResponseEntity<ResponseClienteDTO> buscarClientePorId(@PathVariable Long id){
        return clienteRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    //METODO POST
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseClienteDTO adicionarCliente(@RequestBody ResponseClienteDTO responseClienteDTO){
        return clienteRepository.save(responseClienteDTO);
    }
    //METODO PUT
    @PutMapping()
    public ResponseEntity<ResponseClienteDTO> atualizarCliente(@PathVariable Long id, @RequestBody ResponseClienteDTO responseClienteDTO){
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
