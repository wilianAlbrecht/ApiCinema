package com.wilian.ApiCinema.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
	
	private String nome;
	private String tipo;
	private String categoria;
	private int assento;
	
	@OneToOne
	@JoinColumn(name = "sessaoCodigo")
	@JsonIgnore
	private Sessao sessao;
	
	@ManyToOne
	@JsonIgnore
	private Filme filme;
	
}
