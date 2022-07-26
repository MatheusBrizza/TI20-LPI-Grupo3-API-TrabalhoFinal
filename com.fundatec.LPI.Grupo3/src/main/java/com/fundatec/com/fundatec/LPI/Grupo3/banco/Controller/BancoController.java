package com.fundatec.com.fundatec.LPI.Grupo3.banco.Controller;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Banco;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Service.BancoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/bancos")
@RequiredArgsConstructor
public class BancoController {
    @Autowired
    private BancoService bancoService;
    private Banco banco;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity <Banco> findAll(){
//        List<Banco> banco =
//        return ResponseEntity.ok(banco);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public ResponseEntity<Banco> findById(@PathVariable("id") Long id){
        Banco banco = bancoService.findById(id);
        return ResponseEntity.ok(banco);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Banco> criarUmNovoBanco(@RequestBody Banco banco){
        return ResponseEntity.status(HttpStatus.CREATED)
        //Duvida
    }
}
