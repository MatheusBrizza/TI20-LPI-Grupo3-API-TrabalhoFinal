package com.fundatec.com.fundatec.LPI.Grupo3.banco.model;

//import com.fundatec.com.fundatec.LPI.Grupo3.Antigo.service.model.Banco;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.eenum.StatusDaConta;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.eenum.TiposDeContas;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Conta {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Saldo")
    private BigDecimal saldo;

    @Column(name = "dataCricaoConta")
    private LocalDate dataCriacao;

    @Enumerated(EnumType.STRING)
    @Column(name = "Status_Conta")
    private StatusDaConta statusDaConta;

    @Column(name = "Senha")
    private String senha;

    @OneToOne
    @JoinColumn
    private Cliente cliente;
    @Enumerated(EnumType.STRING)
    @Column(name = "Tipo_Conta")
    private TiposDeContas tiposDeContas;

    @ManyToOne
    @JoinColumn(name = "id_banco")
//    private Banco banco;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Movimentacao> movimentacoes;

    public boolean verificarStatus(StatusDaConta statusDaConta){

        return StatusDaConta.INATIVA != statusDaConta;
    }

    public void depositar(BigDecimal saldo) {
      if (saldo == null || saldo.compareTo(BigDecimal.valueOf(0.0)) == 0 || saldo.compareTo(BigDecimal.valueOf(0.0)) <0){
          throw new IllegalArgumentException("Valor inválido! Não é possivel depositar este valor!");
        }
        else {
            saldo = saldo.add(saldo);
        }
    }
    public void sacar(BigDecimal saldo){
        if (saldo == null || saldo.compareTo(BigDecimal.ZERO) == 0 || saldo.compareTo(BigDecimal.valueOf(0.0))< 0){
            throw new IllegalArgumentException("Valor inválido! A quantia não poderá ser sacada!");
        }
        else if (saldo.compareTo(saldo) > 0 && !this.tiposDeContas.equals(TiposDeContas.CONTA_ESPECIAL)){
            throw new RuntimeException("Valor maioor que o saldo!");
        }
        else if (getSaldo().compareTo(BigDecimal.ZERO) == 0){
            throw new RuntimeException("Seu saldo está zerado");
        }
        else {
            saldo = saldo.subtract(saldo);
        }
    }


    public void gerarSaldoPoupanca(){
        if (this.tiposDeContas.equals(TiposDeContas.CONTA_POUPANÇA)){
            LocalDate dataMovimentacao = LocalDate.now();
            long diferencaTempoEntreMovimentacoes = DAYS.between(dataMovimentacao, dataUltimaMovimentacao);
            BigDecimal saldoAtual = this.saldo.multiply(BigDecimal.valueOf(this.tiposDeContas.getSaldo)));
            dataUltimaMovimentacao = dataMovimentacao;
        }
    }
}
