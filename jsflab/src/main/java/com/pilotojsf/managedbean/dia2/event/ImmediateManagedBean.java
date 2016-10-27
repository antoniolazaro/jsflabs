package com.pilotojsf.managedbean.dia2.event;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="immediateManagedBean")
@ViewScoped
public class ImmediateManagedBean implements Serializable {
	
	private String texto;
	private String texto2;

	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public String getTexto2() {
		return texto2;
	}
	public void setTexto2(String texto2) {
		this.texto2 = texto2;
	}
	
	public void action(){
		System.out.println("Chamou action..."+texto);
		System.out.println("Chamou action..."+texto2);
	}
	
}
