package com.fundatec.com.fundatec.LPI.Grupo3.servicoPessoas.model;

<<<<<<< HEAD:com.fundatec.LPI.Grupo3/src/main/java/com/fundatec/com/fundatec/LPI/Grupo3/banco/repository/servicoPessoas/model/PessoaJuridica.java
package com.fundatec.com.fundatec.LPI.Grupo3.banco.repository.servicoPessoas.model;

import javax.persistence.*;

@Entity
public class PessoaJuridica extends Pessoa {
=======
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

>>>>>>> ad3bde725c4ab75809d7bea62134f77b7989a998:com.fundatec.LPI.Grupo3/src/main/java/com/fundatec/com/fundatec/LPI/Grupo3/servicoPessoas/model/PessoaJuridica.java
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_pessoa;

<<<<<<< HEAD:com.fundatec.LPI.Grupo3/src/main/java/com/fundatec/com/fundatec/LPI/Grupo3/banco/repository/servicoPessoas/model/PessoaJuridica.java
=======

>>>>>>> ad3bde725c4ab75809d7bea62134f77b7989a998:com.fundatec.LPI.Grupo3/src/main/java/com/fundatec/com/fundatec/LPI/Grupo3/servicoPessoas/model/PessoaJuridica.java
}
