package com.pilotojsf.managedbean.dia2.navigation;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="navigatorManagedBean")
@ViewScoped
public class NavigatorManagedBean implements Serializable {
	
	private Integer codigo;

	public String navegacaoImplicita(){
		return "destinyNavigation";
	}
	
	public String navegacaoImplicitaErrada(){
		return "destinyNavigationWrong";
	}
	public String navegacaoExplicita(){
		return "nextPage";
	}
	
	public String navegacaoExplicitaErrada(){
		return "nextPageWrong";
	}
	
	public String navegacaoCondicionalManagedBean(){
		if(codigo != null){
			if(codigo > 10){
				return "destinyNavigation";
			}
		}
		return "conditionalNavigation";
	}
	
	public String navegacaoExplicitaErradaFaces(){
		return "nextPageWrongFaces";
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
}
