package com.wilian.ApiCinema.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Filme extends BaseIdentificador{
	
	private String titulo;
	private int duracao;
	private String genero;
	
	@ManyToMany
	@JoinTable( name = "ator_filme",
			joinColumns = @JoinColumn(name = "filmeCodigo"),
			inverseJoinColumns = @JoinColumn(name = "atorCodigo")
			)
	private List<Ator> atores;
	
}
