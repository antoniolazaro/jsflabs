package com.pilotojsf.managedbean.demo;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ApplicationScoped
@ManagedBean(name="banco",eager=true)
public class BancoManagedBean {
	
	private List<UsuarioModel> usuarios;

	@PostConstruct
	public void init(){
		this.usuarios = new ArrayList<>();
		this.usuarios.add(new UsuarioModel("admin","123456"));
		this.usuarios.add(new UsuarioModel("demo","123456"));
	}
	
	public List<UsuarioModel> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<UsuarioModel> usuarios) {
		this.usuarios = usuarios;
	}

}
