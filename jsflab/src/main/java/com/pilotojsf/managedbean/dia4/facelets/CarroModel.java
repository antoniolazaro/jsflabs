package com.pilotojsf.managedbean.dia4.facelets;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CarroModel implements Serializable
{
	
	private String nome;
	private String marca;
	private List<String> modelos;
	
	public CarroModel() {
		// TODO Auto-generated constructor stub
	}
	
	public CarroModel(String nome, String marca) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.modelos = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public List<String> getModelos() {
		return modelos;
	}

	public void setModelos(List<String> modelos) {
		this.modelos = modelos;
	}

}
