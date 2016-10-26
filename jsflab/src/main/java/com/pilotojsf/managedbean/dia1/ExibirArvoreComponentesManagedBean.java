package com.pilotojsf.managedbean.dia1;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.component.html.HtmlForm;
import javax.faces.context.FacesContext;

@ManagedBean(name="exibirArvoreComponentesManagedBean")
@ViewScoped
public class ExibirArvoreComponentesManagedBean implements Serializable {

	private static final long serialVersionUID = 545429661720889294L;

	private String componentesView;
	
	public String getComponentesView() {
		return componentesView;
	}
	
	public void setComponentesView(String componentesView) {
		this.componentesView = componentesView;
	}

	
	public void actionExibirConteudoArvore(){
		componentesView = getComponentesViewContent();
	}

	private String getComponentesViewContent() {
		UIViewRoot viewRoot =  FacesContext.getCurrentInstance().getViewRoot();
		StringBuilder buffer = new StringBuilder();
		buffer.append("Número de filhos: "+viewRoot.getChildCount()).append("</br>").
		append("ID: "+viewRoot.getId()).append("</br>").
		append("View ID: "+viewRoot.getViewId()).append("</br>");
		
	    UIComponent component1 = viewRoot.findComponent("formularioArvoreComponentes");  //form id
	    HtmlForm form = (HtmlForm)component1;
	    List<UIComponent> componentList = form.getChildren();

	    for(int i=0; i<componentList.size(); i++) {
	        UIComponent component = componentList.get(i);
	        buffer.append("Componente "+i+": "+component.getId()).append("</br>");
	    }
		return buffer.toString();
	}
}
