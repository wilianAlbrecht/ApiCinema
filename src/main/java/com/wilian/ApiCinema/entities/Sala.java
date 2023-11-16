package com.wilian.ApiCinema.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
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
public class Sala extends BaseIdentificador{

	private int numAssentos;
	private String tipoTela;
	private String localizacao;
	
	@OneToOne
//	@JoinColumn(name = "salaCodigo")
	private Sessao sessao;
	
}
