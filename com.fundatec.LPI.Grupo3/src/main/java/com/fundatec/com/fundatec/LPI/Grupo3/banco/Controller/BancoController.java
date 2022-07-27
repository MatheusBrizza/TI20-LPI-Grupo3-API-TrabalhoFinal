package com.fundatec.com.fundatec.LPI.Grupo3.banco.Controller;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.DTO.ResponseBancoDTO;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Banco;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Service.BancoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/bancos")
@RequiredArgsConstructor
public class BancoController {
    @Autowired
    private BancoService bancoService;
    private Banco banco;

    public BancoController(BancoService bancoService, Banco banco) {
        this.bancoService = bancoService;
        this.banco = banco;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ResponseBancoDTO> findAll(){
        return bancoService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public ResponseEntity<ResponseBancoDTO> findById(@PathVariable("id") Long id){
        ResponseBancoDTO banco = bancoService.findById(id);
        return ResponseEntity.ok(banco);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Banco> criarUmNovoBanco(@RequestBody Banco banco){
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
