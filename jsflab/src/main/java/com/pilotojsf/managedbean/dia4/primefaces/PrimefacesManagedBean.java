package com.pilotojsf.managedbean.dia4.primefaces;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="primefacesManagedBean")
@ViewScoped
public class PrimefacesManagedBean implements Serializable {
	
	private String texto;

	public void action() throws Exception {
		Thread.sleep(3*1000);
		System.out.println("Texto..."+texto);
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	
	
}
