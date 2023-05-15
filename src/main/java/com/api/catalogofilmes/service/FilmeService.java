package com.api.catalogofilmes.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.api.catalogofilmes.model.Filme;

@Service
public interface FilmeService {

		public Filme createFilme(Filme filme);

		public List<Filme> getFilme();

		public Filme filmeGetById(long id);

		public Filme updateFilme(Filme filme, long id);

		public void deleteFilme(long id);

		
	}
