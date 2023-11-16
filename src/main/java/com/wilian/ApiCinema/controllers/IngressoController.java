package com.wilian.ApiCinema.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wilian.ApiCinema.dtos.IngressoDTO;
import com.wilian.ApiCinema.entities.Filme;
import com.wilian.ApiCinema.entities.Ingresso;
import com.wilian.ApiCinema.services.FilmeService;
import com.wilian.ApiCinema.services.IngressoService;

@Controller
@RequestMapping("ingresso")
public class IngressoController {

	@Autowired
	private IngressoService ingressoService;
	@Autowired
	private FilmeService filmeService;
	
	@GetMapping("/buscar")
	public ResponseEntity buscarIngresso(@RequestBody IngressoDTO ingressoDTO) {
		
		try {
			
			List<Ingresso> ingressos = ingressoService.buscarIngresso(ingressoDTO);
			
			if(ingressos == null) {
				return ResponseEntity.ok("Não existe ingresso comprado com esse nome");
			}else {
				return ResponseEntity.ok(ingressos);
			}
			
			
		} catch (Exception e) {
			System.err.println("Erro ao buscar o ingresso" + e);
			return ResponseEntity.badRequest().body("Erro ao buscar o ingresso");
		}
		
	}
	
	@PutMapping("/reservar")
	public ResponseEntity reservarIngresso(@RequestBody IngressoDTO ingressoDTO) {
		
		try {
			
			Filme filme = filmeService.buscarFilme(ingressoDTO.getFilme());
			
			if(filme == null) {
				return ResponseEntity.ok("Esse filme não está em cartaz");
			}else {
				Ingresso novoIngresso = new Ingresso();
				novoIngresso.setFilme(filme);
				novoIngresso.setNome(ingressoDTO.getNome());
				novoIngresso.setTipo(ingressoDTO.getTipo());
				novoIngresso.setCategoria(ingressoDTO.getCategoria());
				novoIngresso.setAssento(ingressoDTO.getAssento());
				
				ingressoService.salvarIngresso(novoIngresso);
				
				return ResponseEntity.ok("Ingresso reservado com sucesso.");
			}
			
		} catch (Exception e) {
			System.err.println("Erro ao reservar o ingresso" + e);
			return ResponseEntity.badRequest().body("Erro ao reservar o ingresso");
		}
		
	}
	
}
