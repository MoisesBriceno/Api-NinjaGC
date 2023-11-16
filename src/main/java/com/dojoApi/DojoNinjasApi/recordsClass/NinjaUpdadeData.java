package com.dojoApi.DojoNinjasApi.recordsClass;

import com.dojoApi.DojoNinjasApi.model.enums.NivelExperiencia;
import jakarta.validation.constraints.NotNull;

public record NinjaUpdadeData(
        @NotNull
        Long id,
        boolean status,
        NivelExperiencia nivelExperiencia
) {
}
