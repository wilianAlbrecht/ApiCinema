package com.wilian.ApiCinema.abstractServices;

import com.wilian.ApiCinema.dtos.AtorDTO;
import com.wilian.ApiCinema.entities.Ator;

public interface AtorAbstractService {

	Ator buscarAtor(AtorDTO atorDTO);
	
}
