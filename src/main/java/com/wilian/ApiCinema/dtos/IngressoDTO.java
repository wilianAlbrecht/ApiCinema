package com.wilian.ApiCinema.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class IngressoDTO {
	
	private Long codigo;
	private String nome;
	private String filme;
	private String tipo;
	private int assento;
	private String categoria;
	
}
