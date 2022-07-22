package com.fundatec.com.fundatec.LPI.Grupo3.banco.Controller;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Endereco;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Service.EnderecoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.PanelUI;
import java.util.List;

@RestController
@RequestMapping("/v1/endereco")
@RequiredArgsConstructor
public class EnderecoController {
    private EnderecoService enderecoService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Endereco> findAll(){
        List<Endereco> endereco = enderecoService.findaAll();
        return ResponseEntity.ok(endereco);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.FOUND)
    public ResponseEntity<Endereco> findById(@PathVariable("id") Long id){
        Endereco endereco = enderecoService.findById(id);
        return ResponseEntity.ok(endereco);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Endereco> criarNovoEndereco(@RequestBody Endereco endereco){
        return ResponseEntity.status(HttpStatus.CREATED)
                // Como prosseguir?
    }
}
