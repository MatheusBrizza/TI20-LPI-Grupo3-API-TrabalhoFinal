package com.fundatec.com.fundatec.LPI.Grupo3.banco.controller;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Conta;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.repository.ContaRepository;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Iterable<Conta> listaTodasConta(){
        return contaRepository.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Conta> listaIdUnico(@PathVariable Long id){
        return contaRepository.findById(id);
    }
    //METODO POST
    //Salva conta
    @PostMapping("/")
    public Conta salvarConta(@RequestBody Conta conta){
        return contaRepository.save(conta);
    }
    //METODO DELETE
    @DeleteMapping("/{id}")
    public void deletarConta(@PathVariable Long id){
        contaRepository.deleteById(id);
    }
    //METODO PUT
    //ATUALIZAR
    @PutMapping("/{id}")
    public Conta atualizarConta(@RequestBody Conta conta,@PathVariable Long id){
        Conta contaParaAtt = contaRepository.findById(id).get();
        contaParaAtt.setStatusDaConta(conta.getStatusDaConta());
        contaParaAtt.setSaldo(conta.getSaldo());
        contaParaAtt.setCliente(conta.getCliente());
        contaParaAtt.setDataCriacao(conta.getDataCriacao());
        contaParaAtt.setMovimentacoes(conta.getMovimentacoes());
        return contaRepository.save(contaParaAtt);
    }

}
