package com.fundatec.com.fundatec.LPI.Grupo3.banco.Controller;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Endereco;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Service.EnderecoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
