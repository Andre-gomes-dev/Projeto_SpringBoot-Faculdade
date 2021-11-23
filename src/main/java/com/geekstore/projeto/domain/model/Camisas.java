package com.geekstore.projeto.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Camisas extends Produtos{
	
	@Column(nullable = false)
	private String tamanho;
	
	@Column(nullable = false)
	private String cor;
	
	@Column(nullable = false)
	private String genero;
	

	
}
