package me.dio.academiadigital.controller;

import jakarta.validation.Valid;
import me.dio.academiadigital.entity.AvaliacaoFisica;
import me.dio.academiadigital.entity.form.AvaliacaoFisicaForm;
import me.dio.academiadigital.entity.form.AvaliacaoFisicaUpdateForm;
import me.dio.academiadigital.service.impl.AvaliacaoFisicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    @Autowired
    private AvaliacaoFisicaServiceImpl service;

    @GetMapping
    public List<AvaliacaoFisica> getAll(){

        return service.getAll();

    }

    @GetMapping("/{id}")
    public AvaliacaoFisica getById(@PathVariable Long id){

        return service.getById(id);

    }

    @PostMapping
    public AvaliacaoFisica create(@Valid @RequestBody AvaliacaoFisicaForm form){

        return service.create(form);

    }

    @PutMapping
    public AvaliacaoFisica update(@RequestBody Long id, AvaliacaoFisicaUpdateForm form){
        return null;
    }

    @DeleteMapping("/{id}/delete")
    public void delete(@PathVariable Long id){
    }

}
