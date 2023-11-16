package com.wilian.ApiCinema.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
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
public class Sessao extends BaseIdentificador{
	
	private String statusSessao;
	private Date dataSessao;
//	private Date horario;
	
	@OneToOne(mappedBy = "sessao")
//	@JoinColumn(name = "ingressoCodigo")
	private Ingresso ingresso;
	
	@OneToMany(mappedBy = "sessao")
//	@OneToOne(mappedBy = "sessao")
	private List<Sala> sala;
	
}
