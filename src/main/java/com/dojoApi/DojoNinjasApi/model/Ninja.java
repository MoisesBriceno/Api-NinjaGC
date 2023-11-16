package com.dojoApi.DojoNinjasApi.model;

import com.dojoApi.DojoNinjasApi.model.enums.NivelExperiencia;
import com.dojoApi.DojoNinjasApi.recordsClass.NinjaRegisterData;
import com.dojoApi.DojoNinjasApi.recordsClass.NinjaUpdadeData;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity(name = "ninjas")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Ninja {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        private String nome;
        private String vila;
        private boolean status;
        @Enumerated(EnumType.STRING)
        private NivelExperiencia nivelExperiencia;

        public Ninja(NinjaRegisterData data){
            this.status = true;
            this.vila = data.vila();
            this.nome = data.nome();
            this.nivelExperiencia = data.nivelExperiencia();

        }

    public void update(NinjaUpdadeData data) {
            this.status = data.status();

            if (data.nivelExperiencia() != null){
                 this.nivelExperiencia = data.nivelExperiencia();
            }
    }
}
