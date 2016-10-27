package com.pilotojsf.managedbean.dia3.event;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.faces.event.ComponentSystemEvent;
import javax.faces.event.ValueChangeEvent;

@ManagedBean(name="eventManagedBean")
@SessionScoped
public class EventManagedBean implements Serializable {
	
	private Integer codigo;
	private String texto;
	private String texto2;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
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
		System.out.println("Chamou action...");
	}
	
	public void actionListener(ActionEvent actionEvent){
		System.out.println("Chamou actionListener...");
		System.out.println("Chamou actionListener..."+actionEvent.getComponent().getClientId());
	}

	public void valueChangeListener(ValueChangeEvent valueChangeEvent){
		System.out.println("Chamou valueChangeListener (old value)..."+valueChangeEvent.getOldValue());
		System.out.println("Chamou valueChangeListener (new value)..."+valueChangeEvent.getNewValue());
		texto = "Novo Valor selecionado = "+ valueChangeEvent.getNewValue();
	}
	
	public void initPreRenderView(ComponentSystemEvent event){
		System.out.println("PrerenderViewEvent -> "+event.getComponent());
	}
}
