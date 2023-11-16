package com.wilian.ApiCinema.dtos;

import java.util.List;

import com.wilian.ApiCinema.entities.Ator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FilmeDTO {

	private Long codigo;
	private String titulo;
	private Integer Duracao;
	private String genero;
	
	private List<AtorDTO> atores;
	
}
