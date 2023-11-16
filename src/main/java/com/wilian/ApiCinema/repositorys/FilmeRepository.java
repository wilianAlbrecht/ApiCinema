package com.wilian.ApiCinema.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wilian.ApiCinema.entities.Filme;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
	
	Filme findByTitulo(String titulo);
	
}
