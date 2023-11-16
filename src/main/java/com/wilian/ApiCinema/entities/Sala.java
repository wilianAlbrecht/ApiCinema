package com.wilian.ApiCinema.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
	
	@ManyToOne
	@JoinColumn(name = "sessao_codigo")
	private Sessao sessao;
//	@JoinColumn(name = "salaCodigo")
	
}
