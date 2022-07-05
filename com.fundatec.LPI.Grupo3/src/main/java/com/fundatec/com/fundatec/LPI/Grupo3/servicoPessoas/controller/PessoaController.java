package com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.controller;
import com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.DTO.PessoaDTO;
import com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.model.Pessoa;
import com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.service.PessoaService;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

public class PessoaController {
    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }
    @GetMapping("/api/v1/pessoas")
    public Optional <Pessoa> Pessoa(Integer id) {
        return pessoaService.getById(id);
    }
    @PostMapping("/api/v1/pessoas")
    Pessoa novaPessoa(@RequestBody PessoaDTO pessoa) {
        return pessoaService.save();
    }
    @PutMapping("/api/v1/pessoas")
    Pessoa updatePessoa (@RequestBody PessoaDTO pessoaAlterada, @PathVariable Long id){
        return pessoaService.update();
    }
    @DeleteMapping("/api/v1/pessoas/{id}")
    void delete(@PathVariable Long id) {
        pessoaService.deleteByID(id);
    }
}
