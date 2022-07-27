package com.fundatec.com.fundatec.LPI.Grupo3.banco.Converter;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.DTO.ResponseBancoDTO;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Banco;

public class BancoConverter {
    public static  ResponseBancoDTO converterParaResponse (Banco banco){
        ResponseBancoDTO responseBancoDTO = new ResponseBancoDTO();
        responseBancoDTO.setNome(banco.getNome());
        responseBancoDTO.setSenha(banco.getSenha());
        return responseBancoDTO;
    }


}
