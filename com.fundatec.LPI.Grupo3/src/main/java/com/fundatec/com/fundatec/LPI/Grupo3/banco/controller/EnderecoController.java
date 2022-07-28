package com.fundatec.com.fundatec.LPI.Grupo3.banco.controller;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Endereco;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.service.EnderecoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/endereco")
@RequiredArgsConstructor
public class EnderecoController {
    private EnderecoService enderecoService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Iterable<Endereco>> findAll(){
        Iterable<Endereco> endereco = enderecoService.findaAll();
        return ResponseEntity.ok(endereco);
    }
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public ResponseEntity<Endereco> findById(@PathVariable("id") Long id) {
        Endereco endereco = enderecoService.findById(id).get();
        return ResponseEntity.ok(endereco);
    }
}
