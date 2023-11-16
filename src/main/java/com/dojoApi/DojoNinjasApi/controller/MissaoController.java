package com.dojoApi.DojoNinjasApi.controller;

import com.dojoApi.DojoNinjasApi.model.Missao;
import com.dojoApi.DojoNinjasApi.recordsClass.MissaoRegisterDate;
import com.dojoApi.DojoNinjasApi.repository.MissaoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("missao")
public class MissaoController {
    @Autowired
    private MissaoRepository missaoRepository;

    @PostMapping("create")
    @Transactional
    public void createMissao (@RequestBody @Valid MissaoRegisterDate data){
        missaoRepository.save( new Missao(data));
    }
}
