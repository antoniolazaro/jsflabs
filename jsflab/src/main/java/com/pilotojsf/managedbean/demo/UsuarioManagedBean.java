package com.pilotojsf.managedbean.demo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.pilotojsf.ManagedBeanUtil;

@ViewScoped
@ManagedBean(name="usuarioManagedBean")
public class UsuarioManagedBean implements Serializable{
	
	private UsuarioModel usuario;
	private List<UsuarioModel> usuarios;
	
	@PostConstruct
	public void init(){
		this.usuario = new UsuarioModel();	
		this.usuarios = new ArrayList<>();
	}
	
	public String salvar(){
		if(usuario.getLogin() != ""){
			BancoDadosUtil.getUsuarios().add(usuario);
			ManagedBeanUtil.setMensagemSucesso("Dados atualizados com sucesso");
			return "/demo/paginaInicial";
		}
		ManagedBeanUtil.setMensagemErro("Login não encontrado.");
		return "";
	}
	
	public void listar(){
		this.usuarios = BancoDadosUtil.getUsuarios();
	}

	public UsuarioModel getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}
	
	public List<UsuarioModel> getUsuarios() {
		return usuarios;
	}
	
	public void setUsuarios(List<UsuarioModel> usuarios) {
		this.usuarios = usuarios;
	}

}
