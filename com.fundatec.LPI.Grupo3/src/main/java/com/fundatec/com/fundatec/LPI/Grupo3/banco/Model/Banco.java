package com.fundatec.com.fundatec.LPI.Grupo3.banco.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
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

    private String senha;
}
