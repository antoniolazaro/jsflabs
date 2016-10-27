package com.pilotojsf.managedbean.dia2.event;

import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

public class ValueChangeListenerSample implements ValueChangeListener{

	@Override
	public void processValueChange(ValueChangeEvent event) throws AbortProcessingException {
		System.out.println("Chamou valueChangeListener classe (old value)..."+event.getOldValue());
		System.out.println("Chamou valueChangeListener classe (new value)..."+event.getNewValue());
		EventManagedBean country = (EventManagedBean) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("eventManagedBean");
		country.setTexto2("Novo Valor selecionado na classe = "+event.getNewValue().toString());
	}

}
