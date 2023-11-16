package com.wilian.ApiCinema.abstractServices;

import com.wilian.ApiCinema.dtos.FilmeDTO;
import com.wilian.ApiCinema.entities.Filme;

public interface FilmeAbstractService {

	Filme buscarFilme(String titulo);
	
	boolean cadastrarFilme(Filme filme);
	
	void apagarFilme(Filme filme);
	
	void atualizarFilme(Filme filme);
	
}
