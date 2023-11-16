package com.wilian.ApiCinema.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wilian.ApiCinema.dtos.AtorDTO;
import com.wilian.ApiCinema.dtos.FilmeDTO;
import com.wilian.ApiCinema.dtos.NovoFilmeDTO;
import com.wilian.ApiCinema.entities.Ator;
import com.wilian.ApiCinema.entities.Filme;
import com.wilian.ApiCinema.services.AtorService;
import com.wilian.ApiCinema.services.FilmeService;

import io.micrometer.common.util.StringUtils;

@RestController
@RequestMapping("filme")
public class FilmeController {

	@Autowired
	private FilmeService filmeService;

	@Autowired
	private AtorService atorService;

//	public FilmeController(FilmeService filmeService) {
//		this.filmeService = filmeService;
//	}

	@GetMapping("/buscar")
	public ResponseEntity buscarFilmes(@RequestBody FilmeDTO filmeDTO) {

		try {

			Filme filme = filmeService.buscarFilme(filmeDTO.getTitulo());

			return ResponseEntity.ok(filme);

		} catch (Exception e) {
			System.err.println("Erro ao buscar filmes" + e);
			return ResponseEntity.badRequest().body("Erro ao buscar filmes");
		}

	}

	@PutMapping("/cadastrar")
	public ResponseEntity cadastrarFilme(@RequestBody FilmeDTO filmeDTO) {

		try {

			Filme novoFilme = new Filme();

			List<Ator> atores = new ArrayList<>();

			for (AtorDTO atorDTO : filmeDTO.getAtores()) {

				Ator novoAtor = atorService.buscarAtor(atorDTO);

				if (novoAtor == null) {
					return ResponseEntity.ok("O ator " + novoAtor.getNome() + " não está cadastrado");
				} else {
					atores.add(novoAtor);
				}

			}

			novoFilme.setAtores(atores);
			novoFilme.setTitulo(filmeDTO.getTitulo());
			novoFilme.setGenero(filmeDTO.getGenero());
			novoFilme.setDuracao(filmeDTO.getDuracao());

			boolean salvou = filmeService.cadastrarFilme(novoFilme);

			if (salvou) {
				return ResponseEntity.ok("Filme cadastrado");
			} else {
				return ResponseEntity.ok("Erro ao cadastrar filme");
			}

		} catch (Exception e) {
			System.err.println("Erro ao cadastrar o filme" + e);
			return ResponseEntity.badRequest().body("Erro ao cadastrar o filme");
		}

	}

	@DeleteMapping("/apagar")
	public ResponseEntity apagarFilme(@RequestBody FilmeDTO filmeDTO) {

		try {

			Filme filme = filmeService.buscarFilme(filmeDTO.getTitulo());

			if (filme == null) {
				return ResponseEntity.ok("Filme não cadastrado");
			} else {
				filmeService.apagarFilme(filme);
			}

			return ResponseEntity.ok("Filme apagado com sucesso");

		} catch (Exception e) {
			System.err.println("Erro ao apagar o filme" + e);
			return ResponseEntity.badRequest().body("Erro ao apagar o filme");
		}

	}

	@PostMapping("/atualizar")
	public ResponseEntity atualizarFilme(@RequestBody NovoFilmeDTO novoFilmeDTO) {

		try {

//			FilmeDTO nomeFilme = new FilmeDTO();
//			nomeFilme.setTitulo(novoFilmeDTO.getTitulo());

			Filme filme = filmeService.buscarFilme(novoFilmeDTO.getTitulo());

			if (filme == null) {
				return ResponseEntity.ok("Filme não encontrado ");
			} else {

				List<Ator> atores = new ArrayList<>();

				if (novoFilmeDTO.getAtores() != null) {

					for (AtorDTO atorDTO : novoFilmeDTO.getAtores()) {

						Ator novoAtor = atorService.buscarAtor(atorDTO);

						if (novoAtor == null) {
							return ResponseEntity.ok("O ator " + novoAtor.getNome() + " não está cadastrado");
						} else {
							atores.add(novoAtor);
						}

					}
					filme.setAtores(atores);
				}

				if (novoFilmeDTO.getDuracao() != null) {
					filme.setDuracao(novoFilmeDTO.getDuracao());
				}

				if (StringUtils.isNotEmpty(novoFilmeDTO.getGenero())) {
					filme.setGenero(novoFilmeDTO.getGenero());
				}

				if (StringUtils.isNotEmpty(novoFilmeDTO.getNovoTitulo())) {
					filme.setTitulo(novoFilmeDTO.getNovoTitulo());
				}
				
				filmeService.atualizarFilme(filme);

				return ResponseEntity.ok("Filme alterado com sucesso");
			}

		} catch (Exception e) {
			System.err.println("Erro ao apagar o filme" + e);
			return ResponseEntity.badRequest().body("Erro ao apagar o filme");
		}

	}

}
