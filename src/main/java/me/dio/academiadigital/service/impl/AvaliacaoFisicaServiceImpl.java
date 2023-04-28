package me.dio.academiadigital.service.impl;

import me.dio.academiadigital.entity.Aluno;
import me.dio.academiadigital.entity.AvaliacaoFisica;
import me.dio.academiadigital.entity.form.AvaliacaoFisicaForm;
import me.dio.academiadigital.entity.form.AvaliacaoFisicaUpdateForm;
import me.dio.academiadigital.repository.AlunoRepository;
import me.dio.academiadigital.repository.AvaliacaoFisicaRepository;
import me.dio.academiadigital.service.IAvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {

    @Autowired
    private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {

        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();

        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        avaliacaoFisica.setAluno(aluno);
        avaliacaoFisica.setAltura(form.getAltura());
        avaliacaoFisica.setPeso(form.getPeso());

        return avaliacaoFisicaRepository.save(avaliacaoFisica);

    }

    @Override
    public AvaliacaoFisica getById(Long id) {

        return avaliacaoFisicaRepository.findById(id).get();

    }

    @Override
    public List<AvaliacaoFisica> getAll() {

        return avaliacaoFisicaRepository.findAll();

    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {

        AvaliacaoFisica avaliacaoFisica = avaliacaoFisicaRepository.findById(id).get();

        avaliacaoFisica.setAltura(formUpdate.getAltura());
        avaliacaoFisica.setPeso(formUpdate.getPeso());

        return avaliacaoFisicaRepository.save(avaliacaoFisica);
    }

    @Override
    public void delete(Long id) {

        avaliacaoFisicaRepository.deleteById(id);

    }
}
