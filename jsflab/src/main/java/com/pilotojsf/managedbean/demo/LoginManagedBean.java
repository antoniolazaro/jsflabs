package com.pilotojsf.managedbean.demo;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.pilotojsf.ManagedBeanUtil;

@SessionScoped
@ManagedBean(name="loginManagedBean")
public class LoginManagedBean implements Serializable{
	
	private UsuarioModel usuario;
	private UsuarioModel usuarioPesquisado;
	private Boolean usuarioEncontrado;

	@PostConstruct
	public void init(){
		this.usuario = new UsuarioModel();
		this.usuarioPesquisado = new UsuarioModel();
		this.usuarioEncontrado = false;
	}
	
	public LoginManagedBean() {
		// TODO Auto-generated constructor stub
	}
	
	private List<UsuarioModel> getListaUsuarios(){
		return BancoDadosUtil.getUsuarios();
	}
	
	public String login(){
		
		List<UsuarioModel> lista = getListaUsuarios();
		for(UsuarioModel usuarioSalvo:lista){
			if(usuarioSalvo.getLogin().equals(usuario.getLogin()) && usuarioSalvo.getSenha().equals(usuario.getSenha())){
				return "/demo/paginaInicial";
			}
		}
		ManagedBeanUtil.setMensagemErro("Login não realizado.");
		return "";
	}
	
	public void buscar(){
		if(usuarioPesquisado.getLogin() != ""){
			List<UsuarioModel> lista = getListaUsuarios();
			for(UsuarioModel usuarioSalvo:lista){
				if(usuarioSalvo.getLogin().equals(usuarioPesquisado.getLogin())){
					usuarioPesquisado = usuarioSalvo;
					ManagedBeanUtil.setMensagemSucesso("Login encontrado com sucesso");
					usuarioEncontrado = true;
					break;
				}
			}
		}
		if(!usuarioEncontrado){
			ManagedBeanUtil.setMensagemErro("Login não encontrado.");	
		}
	}
	
	public String navegarListagem(){
		return "listagem";
	}
	
	public String atualizarDados(){
		
		if(usuarioPesquisado.getNome() != ""){
			BancoDadosUtil.getUsuarios().remove(usuarioPesquisado);
			BancoDadosUtil.getUsuarios().add(usuarioPesquisado);
			ManagedBeanUtil.setMensagemSucesso("Dados atualizados com sucesso");
			return "/index";
		}
		ManagedBeanUtil.setMensagemSucesso("Dados não atualizados");
		return "";
		
	}

	public UsuarioModel getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}

	public UsuarioModel getUsuarioPesquisado() {
		return usuarioPesquisado;
	}

	public void setUsuarioPesquisado(UsuarioModel usuarioPesquisado) {
		this.usuarioPesquisado = usuarioPesquisado;
	}

	public Boolean getUsuarioEncontrado() {
		return usuarioEncontrado;
	}

	public void setUsuarioEncontrado(Boolean usuarioEncontrado) {
		this.usuarioEncontrado = usuarioEncontrado;
	}

}
