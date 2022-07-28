package com.fundatec.com.fundatec.LPI.Grupo3.banco.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "banco")
public class Banco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @JsonIgnore
    @JsonManagedReference(value = "banco_conta")
    @OneToMany(cascade = CascadeType.ALL)
    private List<Conta> contas;

    @Column(name = "nome")
    private String nome;

    @Column(name = "senha")
    private String senha;
}
