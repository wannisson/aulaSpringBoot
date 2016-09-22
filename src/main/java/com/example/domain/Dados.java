package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dados {
	
	@Id
	private Integer id;
	private Integer qtd;
	
	public Dados() {
		super();
		this.id = id;
	}
	
	public Dados(Integer id) {
		super();
		this.id = id;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getQtd() {
		return qtd;
	}
	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}
	
	public 
	
}
