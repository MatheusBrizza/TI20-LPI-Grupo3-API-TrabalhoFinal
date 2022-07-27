package com.fundatec.com.fundatec.LPI.Grupo3.banco.Converter;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.DTO.ResponseBancoDTO;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.DTO.ResponseContaDTO;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Banco;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Conta;

public class ContaConverter {
    public static ResponseContaDTO converterParaResponse(Conta conta){
        ResponseContaDTO responseContaDTO = new ResponseContaDTO();
        responseContaDTO.setStatusDaConta(conta.getStatusDaConta());
        responseContaDTO.setCliente(conta.getCliente());
        responseContaDTO.setSaldo(conta.getSaldo());
    }
}