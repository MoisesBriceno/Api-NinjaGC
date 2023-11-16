package com.dojoApi.DojoNinjasApi.recordsClass;

import com.dojoApi.DojoNinjasApi.model.Difficulty;
import com.dojoApi.DojoNinjasApi.model.TipoMissao;


public record MissaoRegisterDate(
       long ninja_id,
       Difficulty classificacao,
       TipoMissao tipo_missao,
       boolean status
) {
}
