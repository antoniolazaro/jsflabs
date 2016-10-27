package com.pilotojsf.managedbean.dia3.ajax;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ValueChangeEvent;

@ManagedBean(name="ajaxManagedBean")
@ViewScoped
public class AjaxManagedBean implements Serializable {
	
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
	
	public void valueChangeListener(ValueChangeEvent valueChangeEvent){
		System.out.println("Chamou valueChangeListener (old value)..."+valueChangeEvent.getOldValue());
		System.out.println("Chamou valueChangeListener (new value)..."+valueChangeEvent.getNewValue());
		texto = "Novo Valor selecionado = "+ valueChangeEvent.getNewValue();
	}
	
	public void action(){
		System.out.println("Chamou action..."+texto);
		System.out.println("Chamou action..."+texto2);
	}
	
}
