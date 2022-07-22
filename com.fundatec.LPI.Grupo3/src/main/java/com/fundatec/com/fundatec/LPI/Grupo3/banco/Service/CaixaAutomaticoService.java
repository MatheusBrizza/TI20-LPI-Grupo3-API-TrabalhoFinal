package com.fundatec.com.fundatec.LPI.Grupo3.banco.Service;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Conta;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Movimentacao;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class CaixaAutomaticoService {
    private MovimentacaoService movimentacaoService;

    //Consultar Saldo
    public BigDecimal consultarSaldo(Conta conta){
        //Se o status estiver inativo deve informar
        return conta.getSaldo();
    }

    //Listar extratos
    public List<Movimentacao> consultarExtrato(Conta conta){
        //Checar se a conta não está inativa
        return conta.getMovimentacao();
    }
    //Depositar
    public  void depositar(Conta conta, BigDecimal saldo){
        //Checar conta inativa
        BigDecimal saldo = conta.getSaldo();
        //Como setar o saldo e adicionar o valor?
    }
    //Sacar
    public void sacar(Conta conta, BigDecimal valor) {
        //Checar conta inativa
        BigDecimal saldo = conta.getSaldo();
        // Diminuir da conta? E adicionar?
    }
    public void addMovimentacao(Movimentacao) {
        movimentacaoService.salvarMovimentacao(Movimentacao
                        .builder()
                        .id(.getId())
                        .conta(.getConta())
                        .saldo(.getSaldo())
                        .dataMovimentacao(.getDataMovimentacao)
                        .build())
    }
    //Conta de Origem e conta Destino
    public Movimentacao transferir(BigDecimal saldo){
        //Checar o statatus da conta de origem e da conta destino
        //Se estiver inativa não de permitir e exibir uma mensagem
        //Se estiver Ok ele tem que salvar a nova movimentação (MovimentecaoService) Usar builder para construir
    }

}
