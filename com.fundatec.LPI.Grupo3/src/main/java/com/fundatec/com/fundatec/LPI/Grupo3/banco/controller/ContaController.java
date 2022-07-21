package com.fundatec.com.fundatec.LPI.Grupo3.banco.controller;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Conta.Conta;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping(value = "/contas")
@RestController
public class ContaController {
    @Autowired
    ContaRepository contaRepository;

    //GET - Retorna todas
    @GetMapping
    public List<Conta> listarTodas(){
        return contaRepository.findAll();
    }
    //Retorna um Id
    public Optional<Conta> listarIdUnico(@PathVariable Long id_conta){
        return contaRepository.findById(id_conta);
    }

    //POST - Salva conta
    public Conta salvarConta(@RequestBody Conta conta){
        return contaRepository.save(conta);
    }
    //PUT - Atualiza
    @PutMapping
    public Conta atualizaConta(@RequestBody Conta conta){
        return contaRepository.save(conta);
    }
}
