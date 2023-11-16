package com.wilian.ApiCinema.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wilian.ApiCinema.entities.Ator;

public interface AtorRepository extends JpaRepository<Ator, Long>{
	
	Ator findByNome(String nome);

}
