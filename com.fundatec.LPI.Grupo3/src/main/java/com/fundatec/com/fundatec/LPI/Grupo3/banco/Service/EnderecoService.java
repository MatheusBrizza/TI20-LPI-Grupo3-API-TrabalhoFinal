package com.fundatec.com.fundatec.LPI.Grupo3.banco.Service;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Endereco;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Repository.EnderecoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EnderecoService {
    private EnderecoRepository enderecoRepository;

    //Salvar Endereço
    public Endereco salvarEndereco(Endereco endereco){
        return enderecoRepository.save(endereco);
    }
    public List<Endereco> findaAll(){
        return enderecoRepository.findAll();
    }

    public Endereco findById(Long id){
        return enderecoRepository.findById(id);
    }
}
