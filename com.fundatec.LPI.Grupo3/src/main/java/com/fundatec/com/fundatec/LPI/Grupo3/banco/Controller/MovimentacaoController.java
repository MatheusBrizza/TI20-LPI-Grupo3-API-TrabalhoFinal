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
    @RequestMapping(method = RequestMethod.POST, path = "salvar")
    public ResponseEntity<Conta> depositar(@RequestBody Movimentacao movimentacao){
        Movimentacao movimentacao = this.movimentacaoService.salvar(movimentacao);
        return new ResponseEntity<>(movimentacao, HttpStatus.OK);
    }
    //Deleta valor
    @RequestMapping(method = RequestMethod.DELETE, path = "deletar/{id}")
    public ResponseEntity <Conta> saldo (@PathVariable Long id){
        this.movimentacaoService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    //Lista Transações
    @RequestMapping(method = RequestMethod.GET, path = "listar")
    public ResponseEntity <?> listar(){
        List<Movimentacao> movimentacao = this.movimentacaoService.listar();
        return new ResponseEntity<>(movimentacao, HttpStatus.OK);
    }

    //Buscar pelo id
    @RequestMapping(method = RequestMethod.GET, path = "buscar/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable Long id){
        movimentacaoService.buscarPeloId(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
