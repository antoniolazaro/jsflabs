package com.pilotojsf.converter.custom;

import java.net.MalformedURLException;
import java.net.URL;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter("com.pilotojsf.converter.custom.CustomConverter")
public class CustomConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {

		StringBuilder url = new StringBuilder();

//		if (!value.startsWith("http://", 0)) {
//			url.append("http://");
//		}
		url.append(value);

		URL teste = null;
		try {
			teste = new URL(url.toString());
		} catch (MalformedURLException e) {
			FacesMessage msg = new FacesMessage("Error converting URL", "Invalid URL format");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
//			facesContext.addMessage("mensagemValidacao",msg);
			throw new ConverterException(msg);
		}

		return teste;
	}

	@Override
	public String getAsString(FacesContext facesContext, UIComponent component, Object value) {
		return value.toString();
	}
}
