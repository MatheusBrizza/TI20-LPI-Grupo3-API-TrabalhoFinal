package com.fundatec.com.fundatec.LPI.Grupo3.banco.service;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Conta.Conta;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Conta.Transacao;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Pessoa.Cliente;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.repository.ClienteRepository;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.repository.ContaRepository;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.repository.TransacaoRepository;
import com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.model.model.ContaCorrente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ContaService {
    @Autowired
    private ContaRepository contaRepository;
    private Conta conta;
    private Cliente cliente;
    private ClienteRepository clienteRepository;
    private Transacao transacao;
    private TransacaoService transacaoService;

    //Lista todas as contas
    public List<Conta> contas(){
        return contaRepository.findAll();
    }
    //Lista as contas por Id
    public Optional<Conta> findById (Long id){
        return contaRepository.findById(id);
    }
    //Salva uma nova conta
    public Conta salvaConta(Conta conta){
        return contaRepository.save(conta);
    }
    //Busca conta por Id
    public Conta findById(Long id){
        return contaRepository.findById(id).get();
    }
    //Deleta conta por Id
    public void deleteById(Long id) {
        contaRepository.deleteById(id);
    }
    //Deleta todas as contas
    public void deleteAll(){
        contaRepository.deleteAll();
    }

    //Especifico Contas Movimentação

    //Depositar
    public void depositar(double saldo, Long id){
        contaRepository.setSaldo(saldo, id);
    }
    public void sacar(BigDecimal saldo, Long id){
        contaRepository.setSaldo(saldo, id);
    }

    //Busca o saldo
    public Conta buscarSaldo(Long id){
        return contaRepository.findById(id);
    }
    public List<Transacao> extratoConta(Long id){
        Conta conta = verificarConta(id);
        return transacaoService.buscarContas(conta);
    }
    //Verifica conta
    public Conta verificarConta(Long id_conta){
        return contaRepository.findById(id_conta);
    }

}
