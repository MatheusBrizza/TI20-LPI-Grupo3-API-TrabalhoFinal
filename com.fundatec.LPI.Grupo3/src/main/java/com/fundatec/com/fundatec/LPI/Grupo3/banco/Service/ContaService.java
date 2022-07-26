package com.fundatec.com.fundatec.LPI.Grupo3.banco.Service;


import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Banco;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Conta;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Movimentacao;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Repository.ClienteRepository;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Repository.ContaRepository;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Cliente;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Enum.StatusDaConta;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class ContaService {
    private ContaRepository contaRepository;
    private ClienteRepository clienteRepository;
    private ClienteService clienteService;
    private  MovimentacaoService movimentacaoService;
    private BancoService bancoService;

    public ContaService(ContaRepository contaRepository, ClienteRepository clienteRepository,
                        ClienteService clienteService, MovimentacaoService movimentacaoService, BancoService bancoService) {
        this.contaRepository = contaRepository;
        this.clienteRepository = clienteRepository;
        this.clienteService = clienteService;
        this.movimentacaoService = movimentacaoService;
        this.bancoService = bancoService;
    }

    //Listar todas as contas
    public Iterable<Conta> findAll(){

        return contaRepository.findAll();
    }
    public Optional<Conta> findById(Long id){
        return contaRepository.findById(id);
    }
    public Conta criarUmaNovaConta(Conta conta, Long id){
        Banco banco = bancoService.findById(id);
        Cliente cliente = clienteService.findById(id).get();
        // Como prosseguir daqui?

        return contaRepository.save(conta);
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
    //Extrato Conta
    public List <Movimentacao> extratoConta(Long id){
        Conta conta = verficarConta(id);
        return movimentacaoService.buscarContas(conta);
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
        //Se estiver inativa não de permitir e exibir uma mensagem
        //Se estiver Ok ele tem que salvar a nova movimentação (MovimentecaoService) Usar builder para construir
    }
}
