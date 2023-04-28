package me.dio.academiadigital.service.impl;

import me.dio.academiadigital.entity.Aluno;
import me.dio.academiadigital.entity.AvaliacaoFisica;
import me.dio.academiadigital.entity.form.AlunoForm;
import me.dio.academiadigital.entity.form.AlunoUpdateForm;
import me.dio.academiadigital.repository.AlunoRepository;
import me.dio.academiadigital.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements IAlunoService {

    @Autowired
    private AlunoRepository repository;

    @Override
    public Aluno create(AlunoForm form) {

        Aluno aluno = new Aluno();

        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataNascimento((form.getDataNascimento()));

        return repository.save(aluno);

    }

    @Override
    public Aluno getById(Long id) {

        return repository.findById(id).get();

    }

    @Override
    public List<Aluno> getAll() {

        return repository.findAll();

    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

        repository.deleteById(id);

    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacoesFisica(Long id){

        Aluno aluno = repository.findById(id).get();

        return aluno.getAvaliacoes();
    }

}
