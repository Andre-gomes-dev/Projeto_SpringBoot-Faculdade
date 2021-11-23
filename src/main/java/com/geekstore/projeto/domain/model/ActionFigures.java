package com.geekstore.projeto.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class ActionFigures extends Produtos{

	
	@Column(nullable = false)
	private int tamanho;
	
	@Column(nullable = false)
	private String categoria;
	
	@Column(nullable = false)
	private boolean articulado;
	

		
	
}
