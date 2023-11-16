package com.wilian.ApiCinema.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wilian.ApiCinema.abstractServices.AtorAbstractService;
import com.wilian.ApiCinema.dtos.AtorDTO;
import com.wilian.ApiCinema.entities.Ator;
import com.wilian.ApiCinema.repositorys.AtorRepository;

@Service
public class AtorService implements AtorAbstractService{

	@Autowired
	private AtorRepository atorRespository;
	
	@Override
	public Ator buscarAtor(AtorDTO atorDTO){
		
		return atorRespository.findByNome(atorDTO.getNome());
		
	}
	
}
