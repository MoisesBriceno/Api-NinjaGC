package com.dojoApi.DojoNinjasApi.recordsClass;

import com.dojoApi.DojoNinjasApi.model.enums.NivelExperiencia;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record NinjaRegisterDate(
        @NotBlank
        String nome,
        @NotBlank
        String vila,
        @NotNull
        boolean status,
        @NotNull
        NivelExperiencia nivelExperiencia
) {
}
