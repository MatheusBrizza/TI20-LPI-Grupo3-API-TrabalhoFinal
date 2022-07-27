package com.fundatec.com.fundatec.LPI.Grupo3.banco.Controller;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Conta;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Movimentacao;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/v1/movimentacao")
public class MovimentacaoController {
    @Autowired
    private MovimentacaoService movimentacaoService;
    //Salva Deposito
    @RequestMapping(method = RequestMethod.POST, path = "/")
    public ResponseEntity<Movimentacao> depositar(@RequestBody Movimentacao movimentacao){
        this.movimentacaoService.salvar(movimentacao);
        return new ResponseEntity<>(movimentacao, HttpStatus.OK);
    }
    //Deleta valor
    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    public ResponseEntity <Conta> saldo (@PathVariable Long id){
        this.movimentacaoService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    //Lista Transações
    @RequestMapping(method = RequestMethod.GET, path = "/")
    public ResponseEntity <?> listar(){
        Iterable<Movimentacao> movimentacao = this.movimentacaoService.listar();
        return new ResponseEntity<>(movimentacao, HttpStatus.OK);
    }

    //Buscar pelo id
    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable Long id){
       Movimentacao movimentacao = movimentacaoService.findById(id).get();
        return new ResponseEntity<>(movimentacao, HttpStatus.OK);
    }
}
