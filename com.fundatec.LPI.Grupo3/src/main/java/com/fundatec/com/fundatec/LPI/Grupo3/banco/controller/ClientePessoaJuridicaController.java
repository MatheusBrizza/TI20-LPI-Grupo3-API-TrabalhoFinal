package com.fundatec.com.fundatec.LPI.Grupo3.banco.controller;


import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.ClientePessoaJuridica;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.service.ClientePessoaJuridicaService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/clientepj")
public class ClientePessoaJuridicaController {

    private final ClientePessoaJuridicaService service;

    public ClientePessoaJuridicaController(ClientePessoaJuridicaService service) {
        this.service = service;
    }
    @PostMapping
    public void salvar(@RequestBody ClientePessoaJuridica clientePessoaJuridica) {
        service.save(clientePessoaJuridica);
    }
    @GetMapping("/{id}")
    public ClientePessoaJuridica findClientePessoaJuridicaById(@PathVariable("id") Integer id) {
        Optional<ClientePessoaJuridica> optionalClientePessoaJuridica = service.findById(id);
        if (optionalClientePessoaJuridica.isPresent()) {
            return optionalClientePessoaJuridica.get();
        }
        return null;
    }

    @GetMapping
    public Iterable<ClientePessoaJuridica> findAll() {
        return service.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        service.delete(id);
    }
}
