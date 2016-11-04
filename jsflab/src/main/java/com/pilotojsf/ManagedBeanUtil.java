package com.pilotojsf;

import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public final class ManagedBeanUtil {
	
	public static HttpServletRequest getRequest(){
		return (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
	}

	public static HttpSession getSession(){
		return getRequest().getSession();
	}

	public static HttpServletResponse getResponse(){
		return (HttpServletResponse)FacesContext.getCurrentInstance().getExternalContext().getResponse();
	}

	public static void setMensagemSucesso(String strMensagem){
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso:"+strMensagem,"Completo");  
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	public static void setMensagemErro(String strMensagem){
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro:"+strMensagem,"Completo");  
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	public static ExternalContext getExternalContext(){
		return FacesContext.getCurrentInstance().getExternalContext();
	}
	
	public static Map<String,Object> getApplicationMap(){
		return FacesContext.getCurrentInstance().getExternalContext().getApplicationMap();
	}

}
