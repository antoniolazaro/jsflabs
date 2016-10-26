package com.pilotojsf.validator.custom;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("piloto.ParametroValidator")
public class ParametroValidator implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		String inicio = (String) component.getAttributes().get("inicio"); 
		String fim = (String) component.getAttributes().get("fim"); 
		if (inicio == null || "".equals(inicio) || fim == null || "".equals(fim)) {
			FacesMessage msg = new FacesMessage("Alguma das datas está vazia","Erro"); 
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);
		}
	}
}
