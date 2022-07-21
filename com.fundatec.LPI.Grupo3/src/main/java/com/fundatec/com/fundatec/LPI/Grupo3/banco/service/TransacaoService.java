package com.fundatec.com.fundatec.LPI.Grupo3.banco.service;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Conta.Conta;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Conta.Transacao;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TransacaoService {
    @Autowired
    private TransacaoRepository transacaoRepository;

    //Salva uma transação
    public Transacao salvar(Transacao transacao){
        return transacaoRepository.save(transacao);
    }

    //Lista todas as transações
    public List <Transacao> listarTrasacoes(){
        return transacaoRepository.findAll();
    }

    //Deleta por Id
    public void delete(Long id){
        transacaoRepository.findById(id);
    }
    //Busca por Id
    public void buscarPeloId(Long id){
        transacaoRepository.findById(id);
    }
    public List<Transacao> buscarContas(Conta conta){
        return transacaoRepository.findByConta(conta);7
    }
}
