package com.pilotojsf.managedbean.dia1;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class PrimeiroManagedBean implements Serializable {

	private static final long serialVersionUID = 2804850519216535794L;

	private String nome;
	
	public PrimeiroManagedBean() {
		this.nome = "Conteudo de texto do primeiro managed bean..";
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
