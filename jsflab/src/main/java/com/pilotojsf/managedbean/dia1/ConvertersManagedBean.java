package com.pilotojsf.managedbean.dia1;

import java.io.Serializable;
import java.net.URL;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="convertersManagedBean")
@RequestScoped
public class ConvertersManagedBean implements Serializable {

	private String texto;
	private Long numero;
	private Long numero1;
	private Double numero2;
	private Date date;
	private URL custom;
	
	public void actionTeste(){
		
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public Long getNumero1() {
		return numero1;
	}

	public void setNumero1(Long numero1) {
		this.numero1 = numero1;
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

	public URL getCustom() {
		return custom;
	}

	public void setCustom(URL custom) {
		this.custom = custom;
	}
}
