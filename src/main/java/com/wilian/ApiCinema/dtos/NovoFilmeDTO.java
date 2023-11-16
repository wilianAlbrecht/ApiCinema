package com.wilian.ApiCinema.dtos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NovoFilmeDTO {

	private Long codigo;
	private String titulo;
	private String novoTitulo;
	private Integer Duracao;
	private String genero;
	
	private List<AtorDTO> atores;
}
