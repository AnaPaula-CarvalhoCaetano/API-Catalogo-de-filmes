package com.api.catalogofilmes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.catalogofilmes.model.Filme;
import com.api.catalogofilmes.service.FilmeService;

@RestController
public class FilmeController {

	@Autowired
	private FilmeService filmeService;

	@GetMapping("/filme/{id}")
	public Filme getFilmeById(@PathVariable("id") long id) {
		return filmeService.filmeGetById(id);
	}

	@GetMapping("/Filme")
	public List<Filme> getFilme() {
		return filmeService.getFilme();
	}

	@PostMapping("/add")
	public ResponseEntity<Filme> createFilme(@RequestBody Filme filme) {
		Filme createFilme = filmeService.createFilme(filme);
		return ResponseEntity.ok(createFilme);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Filme> updateFilmeById(@RequestBody Filme filme, @PathVariable("id") long id) {
		Filme updatedFilme = filmeService.updateFilme(filme, id);
		return ResponseEntity.ok(updatedFilme);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteFilme(@PathVariable("id") long id) {
		filmeService.deleteFilme(id);
		return "Filme Deleted Successfully..";
	}

}
