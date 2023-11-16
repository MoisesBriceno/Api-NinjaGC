package com.dojoApi.DojoNinjasApi.recordsClass;

import com.dojoApi.DojoNinjasApi.model.NivelExperiencia;

public record NinjaRegisterDate(

        String nome,
        String vila,
        boolean status,
        NivelExperiencia nivelExperiencia
) {
}
