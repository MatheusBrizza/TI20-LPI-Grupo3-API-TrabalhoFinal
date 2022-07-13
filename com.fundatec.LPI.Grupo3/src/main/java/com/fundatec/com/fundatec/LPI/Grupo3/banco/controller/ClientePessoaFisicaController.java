package com.fundatec.com.fundatec.LPI.Grupo3.banco.controller;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.ClientePessoaFisica;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.repository.ClientePessoaFisicaRepository;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.service.ClientePessoaFisicaService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/clientepf")
public class ClientePessoaFisicaController {

    private final ClientePessoaFisicaService service;

    public ClientePessoaFisicaController(ClientePessoaFisicaService service) {
        this.service = service;
    }
    @PostMapping
    public void salvar(@RequestBody ClientePessoaFisica clientePessoaFisica) {
        service.save(clientePessoaFisica);
    }

    @GetMapping("/{id}")
    public ClientePessoaFisica findClientePessoaFisicaById(@PathVariable("id") Integer id) {
        Optional<ClientePessoaFisica> optionalClientePessoaFisica = service.findById(id);
        if (optionalClientePessoaFisica.isPresent()) {
            return optionalClientePessoaFisica.get();
        }
        return null;
    }

    
}
