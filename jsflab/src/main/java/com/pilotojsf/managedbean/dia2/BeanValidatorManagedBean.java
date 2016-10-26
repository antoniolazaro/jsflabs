package com.pilotojsf.managedbean.dia2;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.pilotojsf.managedbean.dia2.model.AlunoModel;

@ManagedBean(name="beanValidatorManagedBean")
@ViewScoped
public class BeanValidatorManagedBean implements Serializable {

	private String texto;
	private AlunoModel aluno;
	
	@PostConstruct
	private void init() {
		this.aluno = new AlunoModel();
	}
	
	public void actionTeste(){
		System.out.println("conteudo da variavel texto -> "+texto);
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public AlunoModel getAluno() {
		return aluno;
	}

	public void setAluno(AlunoModel aluno) {
		this.aluno = aluno;
	}

}
