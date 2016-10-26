package com.pilotojsf.managedbean.dia2.validator;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="validatorsManagedBean")
@ViewScoped
public class ValidatorsManagedBean implements Serializable {

	private String texto;
	private String texto1;
	private String texto2;
	private String textoLength;
	private String textoRegex;
	private Long numero;
	private Double numero2;
	private Date date;
	private String custom;
	
	public void actionTeste(){
		System.out.println("");
	}

	public String getTexto() {
		return texto;
	}

	public String getTexto1() {
		return texto1;
	}

	public void setTexto1(String texto1) {
		this.texto1 = texto1;
	}

	public String getTexto2() {
		return texto2;
	}

	public void setTexto2(String texto2) {
		this.texto2 = texto2;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public Double getNumero2() {
		return numero2;
	}

	public void setNumero2(Double numero2) {
		this.numero2 = numero2;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCustom() {
		return custom;
	}

	public void setCustom(String custom) {
		this.custom = custom;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getTextoLength() {
		return textoLength;
	}

	public void setTextoLength(String textoLength) {
		this.textoLength = textoLength;
	}

	public String getTextoRegex() {
		return textoRegex;
	}

	public void setTextoRegex(String textoRegex) {
		this.textoRegex = textoRegex;
	}

}
