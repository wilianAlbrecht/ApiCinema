package com.wilian.ApiCinema.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wilian.ApiCinema.abstractServices.FilmeAbstractService;
import com.wilian.ApiCinema.dtos.FilmeDTO;
import com.wilian.ApiCinema.entities.Filme;
import com.wilian.ApiCinema.repositorys.FilmeRepository;

@Service
public class FilmeService implements FilmeAbstractService {

	@Autowired
	private FilmeRepository filmeRepository;

	@Override
	public Filme buscarFilme(String titulo) {

		return filmeRepository.findByTitulo(titulo);

	}

	@Override
	public boolean cadastrarFilme(Filme filme) {

		try {
			filmeRepository.save(filme);
			return true;
		} catch (Exception e) {
			System.err.println("Erro ao salvar filme" + e);
			return false;
		}
	}

	@Override
	public void apagarFilme(Filme filme) {
		try {

			filmeRepository.delete(filme);

		} catch (Exception e) {
			System.err.println("Erro ao apagar filme" + e);
		}
	}

	@Override
	public void atualizarFilme(Filme filme) {
		try {

			filmeRepository.save(filme);

		} catch (Exception e) {
			System.err.println("Erro ao apagar filme" + e);
		}

	}

}
