package com.wilian.ApiCinema.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Ingresso extends BaseIdentificador{
	
	private String tipo;
	private  String categoria;
	
	@OneToOne(mappedBy = "ingresso")
	private Sessao sessao;
	
}
