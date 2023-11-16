package com.wilian.ApiCinema.entities;

import java.util.Date;

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
public class Sessao extends BaseIdentificador{
	
	private String statusSessao;
	private Date data;
	private Date horario;
	
	@OneToOne
	@JoinColumn(name = "ingressoCodigo")
	private Ingresso ingresso;
	
	@OneToOne(mappedBy = "sessao")
	private Sala sala;
	
}
