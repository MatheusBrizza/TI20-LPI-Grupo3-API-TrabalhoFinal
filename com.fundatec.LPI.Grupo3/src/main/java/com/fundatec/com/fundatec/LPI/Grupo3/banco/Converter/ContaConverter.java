package com.fundatec.com.fundatec.LPI.Grupo3.banco.Converter;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.DTO.ResponseBancoDTO;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.DTO.ResponseContaDTO;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Banco;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Conta;

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

