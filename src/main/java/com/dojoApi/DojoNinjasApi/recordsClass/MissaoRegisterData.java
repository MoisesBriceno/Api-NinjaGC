package com.dojoApi.DojoNinjasApi.recordsClass;

import com.dojoApi.DojoNinjasApi.model.enums.Difficulty;
import com.dojoApi.DojoNinjasApi.model.enums.TipoMissao;
import jakarta.validation.constraints.NotNull;


public record MissaoRegisterData(
        @NotNull
       long ninja_id,
        @NotNull
        Difficulty classificacao,
        @NotNull
        TipoMissao tipo_missao,
        @NotNull
        boolean status
) {
}
