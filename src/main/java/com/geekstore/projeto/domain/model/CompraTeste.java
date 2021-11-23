package com.geekstore.projeto.domain.model;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;


@Data
public class CompraTeste {
	
	@Autowired
	private User cliente;
	@Autowired
	private Produtos produto;
	
	
	
	private double valorTotal;

	
	
	
	
}
