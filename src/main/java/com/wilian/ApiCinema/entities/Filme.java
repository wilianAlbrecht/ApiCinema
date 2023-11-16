package com.wilian.ApiCinema.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
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
	private Integer duracao;
	private String genero;
	
	@ManyToMany(fetch = FetchType.LAZY,
		     cascade = {
		         CascadeType.PERSIST,
		         CascadeType.MERGE
		     })
	@JoinTable( name = "ator_filme",
			joinColumns = @JoinColumn(name = "filme_codigo"),
			inverseJoinColumns = @JoinColumn(name = "ator_codigo")
			)
	private List<Ator> atores;
	
	@OneToMany(mappedBy = "filme")
//	@JoinColumn(name = "ingresso_codigo")
	private List<Ingresso> ingresso;
	
	
}
