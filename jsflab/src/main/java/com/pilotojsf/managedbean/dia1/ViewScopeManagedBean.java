package com.pilotojsf.managedbean.dia1;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.pilotojsf.ManagedBeanUtil;

@ManagedBean(name="viewScopeManagedBean")
@ViewScoped
public class ViewScopeManagedBean implements Serializable {

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
	
	public void actionEncerrarSessao(){
		ManagedBeanUtil.getSession().invalidate();
	}
}
