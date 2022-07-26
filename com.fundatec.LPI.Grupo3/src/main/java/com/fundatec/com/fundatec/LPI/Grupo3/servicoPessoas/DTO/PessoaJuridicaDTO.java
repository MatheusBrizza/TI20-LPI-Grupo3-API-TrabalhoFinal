package com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.DTO;
package com.
package com.fundatec.LPI.Grupo3/src/main/java/com/fundatec/com/fundatec/LPI/Grupo3/banco/repository/servicoPessoas/DTO/PessoaJuridicaDTO.java
package com.fundatec.com.fundatec.LPI.Grupo3.banco.repository.servicoPessoas.DTO;
package com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.DTO;


>>>>>>> ad3bde725c4ab75809d7bea62134f77b7989a998:com.fundatec.LPI.Grupo3/src/main/java/com/fundatec/com/fundatec/LPI/Grupo3/servicoPessoas/DTO/PessoaJuridicaDTO.java

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class PessoaJuridicaDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;

    @NotNull
    @Column(name = "nome")
    private String nome;

    @NotNull
    @Column (name = "endereco")
    @OneToOne
    private com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.model.Endereco Endereco;

    @NotNull
    @Column(name = "data_cadastro")
    private LocalDate data_cadastro;

    @NotNull
    @Column(name = "Status")
    private Boolean status;

    @NotNull
    @Column(name = "Telefone")
    private Integer telefone;

    @NotNull
    @Column(name = "Email")
    private String email;

}
