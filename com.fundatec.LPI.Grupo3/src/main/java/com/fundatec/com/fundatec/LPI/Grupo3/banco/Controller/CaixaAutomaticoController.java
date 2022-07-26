package com.fundatec.com.fundatec.LPI.Grupo3.banco.Controller;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Conta;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Movimentacao;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Service.CaixaAutomaticoService;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping
public class CaixaAutomaticoController {
    private CaixaAutomaticoService caixaAutomaticoService;
    private ContaService contaService;
    @Autowired
    public CaixaAutomaticoController(CaixaAutomaticoService caixaAutomaticoService, ContaService contaService){
        this.caixaAutomaticoService = caixaAutomaticoService;
        this.contaService = contaService;
    }
    @GetMapping("/saldo/{cpf}")
    @ResponseStatus(HttpStatus.FOUND)
    public BigDecimal consultarSaldoConta(@PathVariable Long id){
        Conta conta = contaService.findById(id);
        return contaService.buscarSaldo(conta);
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
        Conta conta = contaService.findById(id);
        contaService.depositar(conta, saldo);
    }
    @PutMapping("/sacar/{id}/{saldo}")
    @ResponseStatus(HttpStatus.OK)
    public void sacar(@PathVariable Long id, @PathVariable BigDecimal saldo) {
        Conta conta = contaService.findById(id);
        contaService.sacar(conta, saldo);
    }
    // Duvida conta 1 e 2 vão na classe conta?
    @PutMapping("/{idConta1}/{idConta2}/{saldo}")
    @ResponseStatus(HttpStatus.OK)
    public void transferir(@PathVariable Long id_conta1, @PathVariable Long id_conta2, @PathVariable BigDecimal saldo) {
        Conta contaOrigem = contaService.findById(id_conta1);
        Conta contaDestino = contaService.findById(id_conta2);
        contaService.transferir(conta1, conta2, saldo);
    }
}
