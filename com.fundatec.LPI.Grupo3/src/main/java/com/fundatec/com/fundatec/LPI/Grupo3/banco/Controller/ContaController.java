package com.fundatec.com.fundatec.LPI.Grupo3.banco.Controller;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Conta;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Repository.ContaRepository;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/contas")
public class ContaController {
    @Autowired
    private ContaRepository contaRepository;
    private ContaService contaService;

    public ContaController(ContaRepository contaRepository, ContaService contaService) {
        this.contaRepository = contaRepository;
        this.contaService = contaService;
    }

    //METODO GET
    //Listar todas as contas
    @GetMapping
    public Iterable <Conta> findAll(){
        return contaRepository.findAll();
    }
    @GetMapping("/{contasId}")
    public Optional<Conta> findById (@PathVariable Long id){

        return contaRepository.findById(id);
    }
    //METODO POST
    //Salva conta
    public Conta criar(@RequestBody Conta conta){

        return contaRepository.save(conta);
    }
    //METODO DELETE
    public void deletarConta(@RequestBody Conta conta){

        contaRepository.delete(conta);
    }
    //METODO PUT
    //ATUALIZAR
    public Conta atualizarConta(@RequestBody Conta conta){

        return contaRepository.save(conta);
    }

}
