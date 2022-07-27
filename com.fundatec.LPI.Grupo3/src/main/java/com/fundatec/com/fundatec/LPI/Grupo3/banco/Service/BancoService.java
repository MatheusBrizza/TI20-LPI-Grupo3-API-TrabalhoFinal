package com.fundatec.com.fundatec.LPI.Grupo3.banco.Service;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.Converter.BancoConverter;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.DTO.ResponseBancoDTO;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Conta;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Banco;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Repository.BancoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
    public ResponseBancoDTO salvarBanco(Banco banco){

        return BancoConverter.converterParaResponse(bancoRepository.save(banco));
    }
    public Iterable<ResponseBancoDTO> findAll(){

        return BancoConverter.converterParaResponse(bancoRepository.findAll());
    }
    public Optional<Banco> findById(Long id){

        return BancoConverter.converterParaResponse (bancoRepository.findById(id));
    }
}
