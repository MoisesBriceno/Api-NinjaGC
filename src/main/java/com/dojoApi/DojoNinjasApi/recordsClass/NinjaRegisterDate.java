package com.dojoApi.DojoNinjasApi.recordsClass;

import com.dojoApi.DojoNinjasApi.model.enums.NivelExperiencia;

public record NinjaRegisterDate(

        String nome,
        String vila,
        boolean status,
        NivelExperiencia nivelExperiencia
) {
}
