package com.pilotojsf.managedbean.dia1.scope;

import java.io.Serializable;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.pilotojsf.ManagedBeanUtil;

@ManagedBean(name="applicationScopeManagedBean")
@ApplicationScoped
public class ApplicationScopeManagedBean implements Serializable {

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

	public String actionTeste() {
		testeOutput = "Você digitou: "+teste;
		return "backToApplicationScopeManagedBean";
	}
	
	public void actionEncerrarSessao(){
		ManagedBeanUtil.getSession().invalidate();
	}
}
