package com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Conta;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.enums.StatusDaConta;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Banco;
import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Pessoa.Cliente;
import com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.model.model.Movimentacao;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Conta {

    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_conta;

    @Column
    @OneToMany
    @JoinColumn
    private Cliente cliente;

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

    @Column
    private LocalDate dataCriacao;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Movimentacao> Movimentacoes;


    private Long id_pessoa;

}
