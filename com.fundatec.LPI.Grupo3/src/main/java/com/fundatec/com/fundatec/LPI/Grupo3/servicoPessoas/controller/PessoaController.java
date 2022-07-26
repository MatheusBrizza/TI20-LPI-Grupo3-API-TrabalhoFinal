package com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.controller;
import com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.service.PessoaService;
import com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.model.Pessoa;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
@
public class PessoaController {
    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }
    @GetMapping("/api/v1/pessoas")
    public Optional <Pessoa> Pessoa(Long id) {
       return pessoaService.findById(id);
    }
    @PostMapping("/api/v1/pessoas")
    Pessoa novaPessoa(@RequestBody Pessoa pessoa) {
        return pessoaService.save(pessoa);
    }
    @PutMapping("/api/v1/pessoas")
    Pessoa updatePessoa (@RequestBody Pessoa pessoaAlterada, @PathVariable Long id){
        return pessoaService.update(pessoaAlterada);
    }
    @DeleteMapping("/api/v1/pessoas/{id}")
    void delete(@PathVariable Long id) {
        pessoaService.deleteByID(id);
    }
}
