package com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Conta;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.enums.StatusDaConta;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Banco;
import com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.model.model.Movimentacao;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cpf", unique = true)
    private String cpf;

    @Column(name = "senha")
    private String senha;

    @Column(name = "saldo")
    private BigDecimal saldo;

    @ManyToOne
    @JoinColumn(name = "banco_ID")
    private Banco banco;

    @Column(name = "status")
    private StatusDaConta status;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contaAcesso")
    private List<Movimentacao> Movimentacoes;


    private Long id_pessoa;
}
