package com.fundatec.com.fundatec.LPI.Grupo3.banco.Model;

//import com.fundatec.com.fundatec.LPI.Grupo3.Antigo.service.model.Banco;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.Model.Enum.StatusDaConta;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
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

    @ManyToOne
    @JoinColumn(name = "id_banco")
//    private Banco banco;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Movimentacoes> Movimentacoes;

    public boolean verificarStatus(StatusDaConta statusDaConta){
        return StatusDaConta.INATIVA != statusDaConta;
    }

    public void depositar(BigDecimal valor) {}
    //Se o saldo for igual a nulo ou igual a zero ou menor que zero não poderá
    // ser depositado, se não o saldo deve ser adicionado.(add)


    public void sacar(BigDecimal saldo){}
    // Se o saldo for igual a nulo ou igua a zero ou menor que zero
    // Não poderá ser sacado
    // Se o saldo for maior que zero e for do tipo especial deve permitir o saque
    // Se o saldo for zero não poderá ser sacado pois está zerado (subtract)

    public void gerarSaldoPoupanca(){

    }
}
