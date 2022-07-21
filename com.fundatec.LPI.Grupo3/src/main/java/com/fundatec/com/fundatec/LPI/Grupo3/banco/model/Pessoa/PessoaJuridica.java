package com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Pessoa;

import com.fundatec.com.fundatec.LPI.Grupo3.banco.model.Pessoa.Cliente;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
@Entity
@Data
@Builder
public class PessoaJuridica extends Cliente {
    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pj;

    @Column
    private Cliente cliente;

    @Column
    private String cnpj;
}
