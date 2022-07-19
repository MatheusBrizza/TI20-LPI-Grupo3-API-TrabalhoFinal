package com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.model;

<<<<<<< HEAD:com.fundatec.LPI.Grupo3/src/main/java/com/fundatec/com/fundatec/LPI/Grupo3/banco/repository/servicoPessoas/model/PessoaFisica.java
<<<<<<<< HEAD:com.fundatec.LPI.Grupo3/src/main/java/com/fundatec/com/fundatec/LPI/Grupo3/banco/repository/servicoPessoas/model/PessoaFisica.java
package com.fundatec.com.fundatec.LPI.Grupo3.banco.repository.servicoPessoas.model;
========
package com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.model;
>>>>>>>> ad3bde725c4ab75809d7bea62134f77b7989a998:com.fundatec.LPI.Grupo3/src/main/java/com/fundatec/com/fundatec/LPI/Grupo3/banco/repository/servicoPessoas/model/PessoaJuridica.java

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
<<<<<<<< HEAD:com.fundatec.LPI.Grupo3/src/main/java/com/fundatec/com/fundatec/LPI/Grupo3/banco/repository/servicoPessoas/model/PessoaFisica.java
public class PessoaFisica extends Pessoa {
========
public class PessoaJuridica extends Pessoa {
>>>>>>>> ad3bde725c4ab75809d7bea62134f77b7989a998:com.fundatec.LPI.Grupo3/src/main/java/com/fundatec/com/fundatec/LPI/Grupo3/banco/repository/servicoPessoas/model/PessoaJuridica.java

=======
package com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class PessoaFisica extends Pessoa {
>>>>>>> ad3bde725c4ab75809d7bea62134f77b7989a998:com.fundatec.LPI.Grupo3/src/main/java/com/fundatec/com/fundatec/LPI/Grupo3/servicoPessoas/model/PessoaFisica.java
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_pessoa;

<<<<<<< HEAD:com.fundatec.LPI.Grupo3/src/main/java/com/fundatec/com/fundatec/LPI/Grupo3/banco/repository/servicoPessoas/model/PessoaFisica.java

=======
    @NotNull
    @Column(name = "nome")
    private String nome;

    @NotNull
    @Column (name = "enderco")
    @OneToOne
    private Endereco Endereco;

    @NotNull
    @Column(name = "data_cadastro")
    private LocalDate data_cadastro;

    @NotNull
    @Column(name = "Status")
    private Boolean status;

    @NotNull
    @Column(name = "Cargo")
    private Integer cargo;

    @NotNull
    @Column(name = "Especialidade")
    private Integer especialidade;
>>>>>>> ad3bde725c4ab75809d7bea62134f77b7989a998:com.fundatec.LPI.Grupo3/src/main/java/com/fundatec/com/fundatec/LPI/Grupo3/servicoPessoas/model/PessoaFisica.java
}
