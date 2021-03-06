package com.fundatec.com.fundatec.LPI.Grupo3.banco.service;


import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Banco;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Conta;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Movimentacao;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.repository.ClienteRepository;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.repository.ContaRepository;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.eenum.StatusDaConta;
import org.springframework.stereotype.Service;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ContaService {
    private ContaRepository contaRepository;
    private ClienteRepository clienteRepository;
    private ClienteService clienteService;
    private  MovimentacaoService movimentacaoService;
    private BancoService bancoService;

    private Banco banco;

    public ContaService(ContaRepository contaRepository, ClienteRepository clienteRepository,
                        ClienteService clienteService, MovimentacaoService movimentacaoService, BancoService bancoService, Banco banco) {
        this.contaRepository = contaRepository;
        this.clienteRepository = clienteRepository;
        this.clienteService = clienteService;
        this.movimentacaoService = movimentacaoService;
        this.bancoService = bancoService;
        this.banco =banco;
    }

    //Listar todas as contas
    public Iterable<Conta> findAll(){

        return contaRepository.findAll();
    }
    public Optional<Conta> findById(Long id){

        return contaRepository.findById(id);
    }

    public Conta findByCpf(String cpf) {
    return contaRepository.findByCpf(cpf);
    }

    public Iterable<Conta> listarTodasContas() {
        return contaRepository.listarTodasContas();
    }

    public Conta ativar(Long id){
        Conta conta = findById(id).get();
        if (conta.getStatusDaConta().equals(StatusDaConta.ATIVA)) {
            throw  new RuntimeException("CONTA ATIVADA");
        }
        conta.setStatusDaConta(StatusDaConta.ATIVA);
        return contaRepository.save(conta);
    }
    public Conta desativar(Long id){
        Conta conta = findById(id).get();
        if (conta.getStatusDaConta().equals(StatusDaConta.INATIVA)) {
            throw new RuntimeException("Conta Inativa!");
        }
        conta.setStatusDaConta(StatusDaConta.INATIVA);
        return contaRepository.save(conta);
    }
    //Alterar Status
    public Conta alterarStatusDaConta(Long id){
        Conta conta = findById(id).get();
        if(conta.getStatusDaConta() == StatusDaConta.INATIVA){
            return ativar(id);
        }
        return conta;
        }

    //Criar conta
    public Conta criar(Conta conta){
        return contaRepository.save(conta);
    }
    //Verificar Conta
    public Conta verficarConta(Long id){
    return contaRepository.findById(id).get();
    }

    public Conta buscarSaldo(Long id){
        return contaRepository.findById(id).get();
    }
    //Consultar Saldo
    public BigDecimal consultarSaldo(Conta conta){
        if(conta.getStatusDaConta() == StatusDaConta.INATIVA ) {
            throw  new RuntimeException("Conta origem inativa!");
        }
        return conta.getSaldo();
    }

    //Listar extratos
    public List<Movimentacao> consultarExtrato(Conta conta){
        if(conta.getStatusDaConta() == StatusDaConta.INATIVA ) {
            throw  new RuntimeException("Conta origem inativa!");
        }
        return conta.getMovimentacoes();
    }
    private void adicionarMovimentacao(Conta conta, BigDecimal valor,String tipo){
        Movimentacao movimentacao = new Movimentacao();
        movimentacao.setConta(conta);
        movimentacao.setValor(valor);
        movimentacao.setTipo(tipo);
        movimentacao.setDataMovimentacao(LocalDate.now());
        movimentacaoService.salvar(movimentacao);
    }
    //Depositar
    public  void depositar(Conta conta, BigDecimal valor){
        if(conta.getStatusDaConta() == StatusDaConta.INATIVA ) {
            throw  new RuntimeException("Conta origem inativa!");
        }
        BigDecimal saldo = conta.getSaldo();
        saldo = saldo.add(valor);
        conta.setSaldo(saldo);
        contaRepository.save(conta);
        adicionarMovimentacao(conta, valor, "DEPOSITO");
        //Como setar o saldo e adicionar o valor?
    }
    //Sacar
    public void sacar(Conta conta, BigDecimal valor) {
        if(conta.getStatusDaConta() == StatusDaConta.INATIVA ) {
            throw  new RuntimeException("Conta origem inativa!");
        }
        BigDecimal saldo = conta.getSaldo();
        saldo = saldo.subtract(valor);
        conta.setSaldo(saldo);
        contaRepository.save(conta);
        adicionarMovimentacao(conta, valor, "SAQUE");
        // Diminuir da conta? E adicionar?
    }
    //Conta de Origem e conta Destino
    public void transferir(BigDecimal valor, Conta contaOrigem, Conta contaDestino){
        if(contaOrigem.getStatusDaConta() == StatusDaConta.INATIVA ) {
            throw  new RuntimeException("Conta origem inativa!");
        }
        if(contaDestino.getStatusDaConta() == StatusDaConta.INATIVA ) {
            throw  new RuntimeException("Conta origem inativa!");
        }
        sacar(contaOrigem, valor);
        depositar(contaDestino, valor);
        //Checar o statatus da conta de origem e da conta destino
        //Se estiver inativa n??o de permitir e exibir uma mensagem
        //Se estiver Ok ele tem que salvar a nova movimenta????o (MovimentecaoService) Usar builder para construir
    }
}
