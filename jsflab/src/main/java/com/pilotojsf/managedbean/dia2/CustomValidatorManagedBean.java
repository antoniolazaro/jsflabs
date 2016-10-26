package com.pilotojsf.managedbean.dia2;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.pilotojsf.managedbean.dia2.model.AlunoModel;

@ManagedBean(name="customValidatorManagedBean")
@ViewScoped
public class CustomValidatorManagedBean implements Serializable {

	private AlunoModel aluno;
	
	@PostConstruct
	private void init() {
		this.aluno = new AlunoModel();
	}
	
	public void actionTeste(){
		System.out.println("teste...");
	}

	public AlunoModel getAluno() {
		return aluno;
	}

	public void setAluno(AlunoModel aluno) {
		this.aluno = aluno;
	}

}
