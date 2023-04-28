package me.dio.academiadigital.service.impl;

import me.dio.academiadigital.entity.Aluno;
import me.dio.academiadigital.entity.Matricula;
import me.dio.academiadigital.entity.form.MatriculaForm;
import me.dio.academiadigital.repository.AlunoRepository;
import me.dio.academiadigital.repository.MatriculaRepository;
import me.dio.academiadigital.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaServiceImpl implements IMatriculaService{

    @Autowired
    MatriculaRepository matriculaRepository;

    @Autowired
    AlunoRepository alunoRepository;

    @Override
    public Matricula create(MatriculaForm form) {

        Matricula matricula = new Matricula();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();
        matricula.setAluno(aluno);

        return matriculaRepository.save(matricula);

    }

    @Override
    public Matricula getById(Long id) {

        return matriculaRepository.findById(id).get();

    }

    @Override
    public List<Matricula> getAll() {

        return matriculaRepository.findAll();

    }

    @Override
    public void delete(Long id) {

        matriculaRepository.deleteById(id);

    }
}
