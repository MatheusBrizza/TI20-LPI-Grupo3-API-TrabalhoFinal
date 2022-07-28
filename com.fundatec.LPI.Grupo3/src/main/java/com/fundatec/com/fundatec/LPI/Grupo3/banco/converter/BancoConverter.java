package com.fundatec.com.fundatec.LPI.Grupo3.banco.converter;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.dto.ResponseBancoDTO;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Banco;

public class BancoConverter {
    public static  ResponseBancoDTO converterParaResponse (Banco banco){
        ResponseBancoDTO responseBancoDTO = new ResponseBancoDTO();
        responseBancoDTO.setNome(banco.getNome());
        responseBancoDTO.setSenha(banco.getSenha());
        return responseBancoDTO;
    }


}
