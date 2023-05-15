package com.api.catalogofilmes.repository;

import org.springframework.data.repository.CrudRepository;

import com.api.catalogofilmes.model.Filme;

public interface FilmeRepository extends CrudRepository<Filme, Long> {

}
