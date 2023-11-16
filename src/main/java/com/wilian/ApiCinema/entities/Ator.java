package com.wilian.ApiCinema.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
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
public class Ator extends BaseIdentificador {

	private String nome;
	private String papelAtor;
	
	@ManyToMany(mappedBy = "atores")
	private List<Filme> filme;
	
}
