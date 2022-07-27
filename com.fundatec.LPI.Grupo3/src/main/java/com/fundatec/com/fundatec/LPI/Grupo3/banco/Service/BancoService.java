package com.fundatec.com.fundatec.LPI.Grupo3.banco.Service;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.Converter.BancoConverter;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.DTO.ResponseBancoDTO;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Conta;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Banco;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Repository.BancoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public ResponseBancoDTO salvarBanco(Banco banco){

        return BancoConverter.converterParaResponse(bancoRepository.save(banco));
    }
    public List<ResponseBancoDTO> findAll(){
        List<ResponseBancoDTO> lista = new ArrayList<>();
for (Banco banco: bancoRepository.findAll()){
    ResponseBancoDTO dto = BancoConverter.converterParaResponse(banco);
    lista.add(dto);
}
        return lista;
    }
    public ResponseBancoDTO findById(Long id){

        return BancoConverter.converterParaResponse (bancoRepository.findById(id).get());
    }
}
