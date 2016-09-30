package com.pilotojsf.dia1;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.pilotojsf.ManagedBeanUtil;

@ManagedBean(name="sessionScopeManagedBean")
@SessionScoped
public class SessionScopeManagedBean implements Serializable {

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
		return "backToSessionScopeManagedBean";
	}
	
	public void actionEncerrarSessao(){
		ManagedBeanUtil.getSession().invalidate();
	}
}
