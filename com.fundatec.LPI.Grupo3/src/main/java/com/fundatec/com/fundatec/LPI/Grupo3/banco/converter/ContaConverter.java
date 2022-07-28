package com.fundatec.com.fundatec.LPI.Grupo3.banco.converter;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.dto.ResponseBancoDTO;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.dto.ResponseContaDTO;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Banco;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Conta;

public class ContaConverter {
    public static ResponseContaDTO converterParaResponse(Conta conta){
        ResponseContaDTO responseContaDTO = new ResponseContaDTO();
        responseContaDTO.setCpf(conta.getSenha());
    }
}
    public static ResponseBancoDTO converterParaResponse (Banco banco){
        ResponseBancoDTO responseBancoDTO = new ResponseBancoDTO();
        responseBancoDTO.setNome(banco.getNome());
        responseBancoDTO.setSenha(banco.getSenha());
        return responseBancoDTO;

