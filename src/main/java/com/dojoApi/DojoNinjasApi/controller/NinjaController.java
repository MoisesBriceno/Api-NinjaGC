package com.dojoApi.DojoNinjasApi.controller;

import com.dojoApi.DojoNinjasApi.model.Ninja;
import com.dojoApi.DojoNinjasApi.recordsClass.NinjaRegisterDate;
import com.dojoApi.DojoNinjasApi.repository.NinjaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ninja")
public class NinjaController {

    @Autowired
    private NinjaRepository ninjaRepository;
    @PostMapping("create")
    @Transactional
    public void createNinja (@RequestBody @Valid NinjaRegisterDate data){
        ninjaRepository.save( new Ninja(data));
    }


}
