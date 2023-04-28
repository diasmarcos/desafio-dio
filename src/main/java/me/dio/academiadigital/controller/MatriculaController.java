package me.dio.academiadigital.controller;

import jakarta.validation.Valid;
import me.dio.academiadigital.entity.Matricula;
import me.dio.academiadigital.entity.form.MatriculaForm;
import me.dio.academiadigital.service.impl.MatriculaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private MatriculaServiceImpl service;

    @GetMapping
    public List<Matricula> getAll(){

        return service.getAll();

    }

    @GetMapping("/{id}")
    public Matricula getById(@PathVariable Long id){

        return service.getById(id);

    }

    @PostMapping
    public Matricula create(@Valid @RequestBody MatriculaForm form){

        return service.create(form);

    }

    @DeleteMapping("/{id}/delete")
    public void delete(@PathVariable Long id){

    }

}
