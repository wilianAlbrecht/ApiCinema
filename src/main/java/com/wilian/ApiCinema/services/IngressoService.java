package com.wilian.ApiCinema.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wilian.ApiCinema.abstractServices.IngressoAbstractService;
import com.wilian.ApiCinema.dtos.IngressoDTO;
import com.wilian.ApiCinema.entities.Ingresso;
import com.wilian.ApiCinema.repositorys.IngressoRepository;

@Service
public class IngressoService implements IngressoAbstractService{

	@Autowired
	private IngressoRepository ingressoRepository;
	
	@Override
	public List<Ingresso> buscarIngresso(IngressoDTO ingressoDTO) {
		return ingressoRepository.findByNome(ingressoDTO.getNome());
	}
	
	public void salvarIngresso(Ingresso ingresso) {
		ingressoRepository.save(ingresso);
	}

}
