package com.fundatec.com.fundatec.LPI.Grupo3.banco.Service;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Endereco;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Repository.EnderecoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EnderecoService {
    private EnderecoRepository enderecoRepository;

    public EnderecoService(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

    //Salvar Endereço
    public Endereco salvarEndereco(Endereco endereco){
        return enderecoRepository.save(endereco);
    }
    public Iterable<Endereco> findaAll(){
        return enderecoRepository.findAll();
    }

    public Optional<Endereco> findById(Long id){
        return enderecoRepository.findById(id);
    }
}
