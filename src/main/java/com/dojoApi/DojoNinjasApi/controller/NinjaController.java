package com.dojoApi.DojoNinjasApi.controller;

import com.dojoApi.DojoNinjasApi.model.Ninja;
import com.dojoApi.DojoNinjasApi.recordsClass.NinjaRegisterData;
import com.dojoApi.DojoNinjasApi.recordsClass.NinjaUpdadeData;
import com.dojoApi.DojoNinjasApi.repository.NinjaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("ninjas")
public class NinjaController {

    @Autowired
    private NinjaRepository ninjaRepository;
    @PostMapping("create")
    @Transactional
    public void createNinja (@RequestBody @Valid NinjaRegisterData data){
        ninjaRepository.save( new Ninja(data));
    }

    @GetMapping
    public Page<Ninja> getNinjas(@PageableDefault(size = 5) Pageable page){
        return ninjaRepository.findAll(page);
    }

    @GetMapping("encontrar/{id}")
    public ResponseEntity<?> getNinjasById(@PathVariable Long id){
       Optional<Ninja> ninja = ninjaRepository.findById(id);

       return ninja.map(ResponseEntity::ok).orElseGet(() -> ( ResponseEntity.notFound().build()));
    }

    @PutMapping("update")
    @Transactional
    public void updateNinja (@RequestBody @Valid NinjaUpdadeData data){
        Ninja ninja = ninjaRepository.getReferenceById(data.id());
        ninja.update(data);
    }

}
