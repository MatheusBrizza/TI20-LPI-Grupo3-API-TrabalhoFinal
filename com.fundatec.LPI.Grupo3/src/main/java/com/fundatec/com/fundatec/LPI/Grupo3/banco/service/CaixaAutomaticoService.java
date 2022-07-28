package com.fundatec.com.fundatec.LPI.Grupo3.banco.service;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Conta;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.eenum.StatusDaConta;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Movimentacao;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.repository.ContaRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
public class CaixaAutomaticoService {
    private MovimentacaoService movimentacaoService;
    private ContaRepository contaRepository;


    public CaixaAutomaticoService(MovimentacaoService movimentacaoService, ContaRepository contaRepository) {
        this.movimentacaoService = movimentacaoService;
        this.contaRepository = contaRepository;
    }

    //Consultar Saldo
    public BigDecimal consultarSaldo(Conta conta){
        if(conta.getStatusDaConta() == StatusDaConta.INATIVA ) {
            throw  new RuntimeException("Conta origem inativa!");
        }
        return conta.getSaldo();
    }

    //Listar extratos
    public List<Movimentacao> consultarExtrato(Conta conta){
        if(conta.getStatusDaConta() == StatusDaConta.INATIVA ) {
            throw  new RuntimeException("Conta origem inativa!");
        }
        return conta.getMovimentacoes();
    }
    private void adicionarMovimentacao(Conta conta, BigDecimal valor,String tipo){
        Movimentacao movimentacao = new Movimentacao();
        movimentacao.setConta(conta);
        movimentacao.setValor(valor);
        movimentacao.setTipo(tipo);
        movimentacao.setDataMovimentacao(LocalDate.now());
        movimentacaoService.salvar(movimentacao);
    }
    //Depositar
    public  void depositar(Conta conta, BigDecimal valor){
        if(conta.getStatusDaConta() == StatusDaConta.INATIVA ) {
            throw  new RuntimeException("Conta origem inativa!");
        }
        BigDecimal saldo = conta.getSaldo();
        saldo = saldo.add(valor);
        conta.setSaldo(saldo);
        contaRepository.save(conta);
        adicionarMovimentacao(conta, valor, "DEPOSITO");
        //Como setar o saldo e adicionar o valor?
    }
    //Sacar
    public void sacar(Conta conta, BigDecimal valor) {
        if(conta.getStatusDaConta() == StatusDaConta.INATIVA ) {
            throw  new RuntimeException("Conta origem inativa!");
        }
        BigDecimal saldo = conta.getSaldo();
        saldo = saldo.subtract(valor);
        conta.setSaldo(saldo);
        contaRepository.save(conta);
        adicionarMovimentacao(conta, valor, "SAQUE");
        // Diminuir da conta? E adicionar?
    }
    //Conta de Origem e conta Destino
    public void transferir(BigDecimal valor, Conta contaOrigem, Conta contaDestino){
        if(contaOrigem.getStatusDaConta() == StatusDaConta.INATIVA ) {
           throw  new RuntimeException("Conta origem inativa!");
        }
        if(contaDestino.getStatusDaConta() == StatusDaConta.INATIVA ) {
            throw  new RuntimeException("Conta origem inativa!");
        }
        sacar(contaOrigem, valor);
        depositar(contaDestino, valor);
        //Checar o statatus da conta de origem e da conta destino
        //Se estiver inativa não de permitir e exibir uma mensagem
        //Se estiver Ok ele tem que salvar a nova movimentação (MovimentecaoService) Usar builder para construir
    }

}
