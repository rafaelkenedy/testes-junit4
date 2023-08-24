package domain;

import lombok.Data;

@Data
public class Cliente implements Persistente {

    private String nome;
    private Long cpf;
    private String tel;
    private String end;
    private String cidade;
    private String estado;
}
