package com.api.catalogofilmes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.catalogofilmes.model.Filme;
import com.api.catalogofilmes.repository.FilmeRepository;

@Service
public class FilmeServiceImpl implements FilmeService {

	@Autowired
	private FilmeRepository filmeRepository;

	@Override
	public Filme createFilme(Filme filme) {
		return filmeRepository.save(filme);
	}

	@Override
	public List<Filme> getFilme() {
		return (List<Filme>) filmeRepository.findAll();
	}

	@Override
	public Filme filmeGetById(long id) {
		return filmeRepository.findById(id).get();
	}

	@Override
	public void deleteFilme(long id) {
		filmeRepository.deleteById(id);

	}

	@Override
	public Filme updateFilme(Filme filme, long id) {
		Filme filme1 = filmeRepository.findById(id).get();

		filme1.setTitulo(filme1.getTitulo());
		filme1.setGenero(filme1.getGenero());
		filme1.setDiretor(filme1.getDiretor());
		filme1.setAno(filme1.getAno());
		filme1.setDuracao(filme1.getDuracao());
		return filmeRepository.save(filme1);
	}

}
