package com.dojoApi.DojoNinjasApi.model;


import com.dojoApi.DojoNinjasApi.recordsClass.MissaoRegisterDate;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "missoes")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Missao {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long ninja_id;
    @Enumerated(EnumType.STRING)
    private Difficulty classificacao;
    @Enumerated(EnumType.STRING)
    private TipoMissao tipo_missao;
    private boolean status;

    public Missao(MissaoRegisterDate data) {
        this.ninja_id = data.ninja_id();
        this.classificacao = data.classificacao();
        this.tipo_missao = data.tipo_missao();
        this.status = true;
    }
}
