package com.pilotojsf.managedbean.dia4.facelets;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="compositeComponentManagedBean")
@ViewScoped
public class CompositeComponentManagedBean implements Serializable {
	
	public String name;
	public String email;

	public String registerAction(){
		System.out.println("action nome-> "+name);
		System.out.println("action nome-> "+email);
		return "/index";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
