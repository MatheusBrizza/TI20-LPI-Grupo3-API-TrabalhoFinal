package com.fundatec.com.fundatec.LPI.Grupo3.banco.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Tabela_Cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name ="CPF", length = 11, unique = true)
    private String cpf;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco")
    private Endereco endereco;

    @Column(name = "Genero")
    private String genero;

    @Column(name = "data_nascimento")
    private LocalDate data_nascimento;

    @OneToOne(cascade = CascadeType.ALL)
    private Banco banco;

}
