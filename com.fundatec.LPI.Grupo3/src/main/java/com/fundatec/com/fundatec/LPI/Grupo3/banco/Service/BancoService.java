package com.fundatec.com.fundatec.LPI.Grupo3.banco.Service;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Conta;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Banco;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Repository.BancoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BancoService {
    @Autowired
    private BancoRepository bancoRepository;
    private Banco banco;
    private Conta conta;
    public BancoService(BancoRepository bancoRepository, Conta conta, Banco banco){
        this.bancoRepository = bancoRepository;
        this.conta = conta;
        this.banco = banco;
    }
    public Banco salvarBanco(Banco banco){

        return bancoRepository.save(banco);
    }
    public Banco findAll(){

        return bancoRepository.findAll();
    }
    public Banco findById(Long id){

        return bancoRepository.findById(id);
    }
    public Conta getContaById(Banco banco, Long id){

        List<Conta> contas = banco.getConta();
    }
}
