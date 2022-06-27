package com.fundatec.com.fundatec.LPI.Grupo3.service;

import com.fundatec.com.fundatec.LPI.Grupo3.model.ContaCorrente;
import com.fundatec.com.fundatec.LPI.Grupo3.repository.ContaCorrenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaCorrenteService {
    @Autowired
    private ContaCorrenteRepository contaCorrenteRepository;

    public ContaCorrente updateSalvarContaCorrente(ContaCorrente contaCorrente){
        return contaCorrenteRepository.save(contaCorrente);
    }
    public ContaCorrente findById(Long id){
        return contaCorrenteRepository.findById(id).get();
    }
    public List<ContaCorrente> findAll(){
        return contaCorrenteRepository.findAll();
    }
    public void deleteById(Long id){
        contaCorrenteRepository.deleteById(id);
    }
    public ContaCorrente findByNumero (String num){
        return contaCorrenteRepository.findByNumero(num);
    }
    public ContaCorrente findFirstByOrderById(){
        return contaCorrenteRepository.findFirstByOrderById();
    }
    public ContaCorrente findFirstByOrderByIdDesc(){
        return contaCorrenteRepository.findFirstByOrderByIdDesc();
    }
}
