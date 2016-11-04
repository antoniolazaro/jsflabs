package com.pilotojsf.managedbean.demo;

import java.io.Serializable;

public class UsuarioModel implements Serializable{

	private String login;
	private String senha;
	private String nome;
	
	public UsuarioModel() {
		// TODO Auto-generated constructor stub
	}
	
	public UsuarioModel(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof UsuarioModel){
			if(login.equals(((UsuarioModel) obj).getLogin())){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return login.hashCode();
	}
}
