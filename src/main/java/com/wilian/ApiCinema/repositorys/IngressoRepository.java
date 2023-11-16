package com.wilian.ApiCinema.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wilian.ApiCinema.entities.Ingresso;

public interface IngressoRepository extends JpaRepository<Ingresso, Long>{
	
	List<Ingresso> findByNome(String nome);
	
}
