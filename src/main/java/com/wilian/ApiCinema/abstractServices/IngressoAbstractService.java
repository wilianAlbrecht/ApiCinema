package com.wilian.ApiCinema.abstractServices;

import java.util.List;

import com.wilian.ApiCinema.dtos.IngressoDTO;
import com.wilian.ApiCinema.entities.Ingresso;

public interface IngressoAbstractService {
	
	List<Ingresso> buscarIngresso(IngressoDTO ingressoDTO);

}
