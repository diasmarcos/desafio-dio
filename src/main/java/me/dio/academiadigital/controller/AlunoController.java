package me.dio.academiadigital.controller;

import jakarta.validation.Valid;
import me.dio.academiadigital.entity.Aluno;
import me.dio.academiadigital.entity.AvaliacaoFisica;
import me.dio.academiadigital.entity.form.AlunoForm;
import me.dio.academiadigital.entity.form.AlunoUpdateForm;
import me.dio.academiadigital.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl service;

    @PostMapping
    public Aluno create(@Valid @RequestBody AlunoForm form){

        return service.create(form);

    }

    @GetMapping
    public List<Aluno> getAll(){

        return service.getAll();

    }

    @GetMapping("/{id}")
    public Aluno getById(@PathVariable Long id){

        return service.getById(id);

    }

    @GetMapping("/{id}/avaliacoes")
    public List<AvaliacaoFisica> getAllAvaliacoesFisica(@PathVariable Long id){

        return service.getAllAvaliacoesFisica(id);

    }

    @PutMapping
    public Aluno update(@RequestBody Long id, AlunoUpdateForm form){

        return null;
    }

    @DeleteMapping("/{id}/delete")
    public void delete(@PathVariable Long id){

    }

}
