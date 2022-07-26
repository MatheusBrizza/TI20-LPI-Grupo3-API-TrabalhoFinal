package com.fundatec.com.fundatec.LPI.Grupo3.banco.Service;


import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Conta;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Repository.ClienteRepository;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Repository.ContaRepository;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Cliente;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Enum.StatusDaConta;
import com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.model.model.Movimentacao;

import java.util.List;

public class ContaService {
    private ContaRepository contaRepository;
    private ClienteRepository clienteRepository;
    private ClienteService clienteService;

    //Listar todas as contas
    public List<Conta> findAll(){
        return contaRepository.findAll();
    }
    public Conta criarUmaNovaConta(Conta conta, Long id){
//        Banco banco = bancoService.findById(id);
        Cliente cliente = clienteService.findById(id);
        // Como prosseguir daqui?

        return contaRepository.save(conta);
    }
    public Conta ativar(Long id){
        Conta conta = findById(id)
        if (conta.getStatusDaConta().equals(StatusDaConta.ATIVA)) {
            //Mensagem
        }
        //Setar Status??Como?
        return contaRepository.save(conta);
    }
    public Conta desativar(Long id){
        Conta conta = findById(id)
        if (conta.getStatusDaConta().equals(StatusDaConta.INATIVA)) {
            //Mensagem
        }
        //Setar Status
        return contaRepository.save(conta);
    }
    //Alterar Status
    public Conta alterarStatusDaConta(Long id){
        Conta conta = findById(id);
        if(conta.verificarStatus() == StatusDaConta.INATIVA){
            return ativar(id);
        }
        return desativar(id);
        }
    }
    //Criar conta
    public Conta criar(Conta conta){
        return contaRepository.save(conta);
    }
    //Verificar Conta
    public Conta verficarConta(Long id){
        return contaRepository.findById();
    }
    //Extrato Conta
    public List <Movimentacao> extratoConta(Long id){
        Conta conta = verficarConta(id);
        return movimentacaoService.buscarContas(conta);
    }
    public Conta buscarSaldo(Long id){
        return contaRepository.findById(id);
    }

}
