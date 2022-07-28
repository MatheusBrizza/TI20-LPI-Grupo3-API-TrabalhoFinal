package com.fundatec.com.fundatec.LPI.Grupo3.banco.controller;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Conta;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Movimentacao;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.service.CaixaAutomaticoService;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/v1/caixaautomatico")
public class CaixaAutomaticoController {
    private CaixaAutomaticoService caixaAutomaticoService;
    private ContaService contaService;

    public CaixaAutomaticoController(CaixaAutomaticoService caixaAutomaticoService, ContaService contaService) {
        this.caixaAutomaticoService = caixaAutomaticoService;
        this.contaService = contaService;
    }

    @Autowired

    @GetMapping("/saldo/{cpf}")
    @ResponseStatus(HttpStatus.FOUND)
    public BigDecimal consultarSaldoConta(@PathVariable Long id){
        return contaService.buscarSaldo(id).getSaldo();
    }
    @GetMapping("/extrato/{cpf}")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Movimentacao> consultarExtrato(@PathVariable String cpf) {
        Conta conta = contaService.findByCpf(cpf);
        return contaService.consultarExtrato(conta);
    }
    @PutMapping("/depositar/{id}/{saldo}")
    @ResponseStatus(HttpStatus.OK)
    public void depositar(@PathVariable Long id, @PathVariable BigDecimal saldo) {
        Conta conta = contaService.findById(id).get();
        contaService.depositar(conta, saldo);
    }
    @PutMapping("/sacar/{id}/{saldo}")
    @ResponseStatus(HttpStatus.OK)
    public void sacar(@PathVariable Long id, @PathVariable BigDecimal saldo) {
        Conta conta = contaService.findById(id).get();
        contaService.sacar(conta, saldo);
    }
    @PutMapping("/{idOrigem}/{idDestino}/{saldo}")
    @ResponseStatus(HttpStatus.OK)
    public void transferir(@PathVariable ("idOrigem") Long id,
                           @PathVariable ("idDestino") Long idDestino,
                           @PathVariable ()BigDecimal valor) {
        Conta contaOrigem = contaService.findById(id).get();
        Conta contaDestino = contaService.findById(idDestino).get();
        contaService.transferir(valor, contaOrigem, contaDestino);
    }
}
