package com.pilotojsf.managedbean.dia1;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="requestScopeManagedBean")
@RequestScoped
public class RequestScopeManagedBean implements Serializable {

	private String teste;
	private String testeOutput;
	
	public void setTeste(String teste) {
		this.teste = teste;
	}
	
	public String getTeste() {
		return teste;
	}
	
	public String getTesteOutput() {
		return testeOutput;
	}
	
	public void setTesteOutput(String testeOutput) {
		this.testeOutput = testeOutput;
	}

	public void actionTeste() {
		testeOutput = "Você digitou: "+teste;
	}
}
