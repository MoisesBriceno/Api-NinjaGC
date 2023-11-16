package com.dojoApi.DojoNinjasApi.controller;

import com.dojoApi.DojoNinjasApi.model.Ninja;
import com.dojoApi.DojoNinjasApi.recordsClass.NinjaRegisterDate;
import com.dojoApi.DojoNinjasApi.repository.NinjaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ninjas")
public class NinjaController {

    @Autowired
    private NinjaRepository ninjaRepository;
    @PostMapping("create")
    @Transactional
    public void createNinja (@RequestBody @Valid NinjaRegisterDate data){
        ninjaRepository.save( new Ninja(data));
    }

    @GetMapping
    public Page<Ninja> getNinjas(@PageableDefault(size = 5) Pageable page){
        return ninjaRepository.findAll(page);
    }


}
