package com.fundatec.com.fundatec.LPI.Grupo3.banco.Service;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Conta;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Movimentacao;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Repository.MovimentacaoRepository;

import java.util.List;

public class MovimentacaoService {
    private MovimentacaoRepository movimentacaoRepository;
    private Movimentacao movimentacao;
    private Conta conta;

    public Movimentacao findById(Long id) {
        return movimentacaoRepository.findById(id);
    }

    public Movimentacao salvar(Movimentacao movimentacao) {
        return movimentacaoRepository.save(movimentacao);
    }

    public List<Movimentacao> listar() {
        return movimentacaoRepository.findAll();
    }

    public void delete(Long id) {
        movimentacaoRepository.deleteById(id);
    }

    public void buscarPeloId(Long id) {
        movimentacaoRepository.findById(id);
    }

    public List<Movimentacao> buscarContas(Conta conta) {
        return movimentacaoRepository.findByConta(conta);
    }
}
