package com.fundatec.com.fundatec.LPI.Grupo3.banco.service;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Conta;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Movimentacao;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.repository.MovimentacaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimentacaoService {
    private MovimentacaoRepository movimentacaoRepository;
    private Movimentacao movimentacao;
    private Conta conta;

    public MovimentacaoService(MovimentacaoRepository movimentacaoRepository, Movimentacao movimentacao, Conta conta) {
        this.movimentacaoRepository = movimentacaoRepository;
        this.movimentacao = movimentacao;
        this.conta = conta;
    }

    public Optional<Movimentacao> findById(Long id) {
        return movimentacaoRepository.findById(id);
    }

    public Movimentacao salvar(Movimentacao movimentacao) {

        return movimentacaoRepository.save(movimentacao);
    }

    public Iterable<Movimentacao> listar() {

        return movimentacaoRepository.findAll();
    }

    public void delete(Long id) {

        movimentacaoRepository.deleteById(id);
    }

    public List<Movimentacao> findByConta(Conta conta) {
       return movimentacaoRepository.findByConta(conta);
    }

    public List<Movimentacao> buscarContas(Conta conta) {

        return movimentacaoRepository.findByConta(conta);
    }
}
