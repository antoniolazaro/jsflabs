package com.pilotojsf.managedbean.dia4.facelets;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="faceletsManagedBean")
@ViewScoped
public class FaceletsManagedBean implements Serializable {
	
	private List<CarroModel> carros;

	@PostConstruct
	public void init(){
		this.carros = new ArrayList<>();
		carros.add(new CarroModel("X5","BMW"));
		carros.get(0).getModelos().add("Modelo 1 BMW X5");
		carros.get(0).getModelos().add("Modelo 2 BMW X5");
		carros.add(new CarroModel("i8","BMW"));
		carros.get(1).getModelos().add("Modelo 1 BMW I8");
		carros.get(1).getModelos().add("Modelo 2 BMW I8");
		carros.add(new CarroModel("Gol","Volksvagen"));
		carros.get(2).getModelos().add("Modelo 1 Volksvagen Gol");
		carros.get(2).getModelos().add("Modelo 2 Volksvagen Gol");
		carros.add(new CarroModel("Polo","Volksvagen"));
		carros.get(3).getModelos().add("Modelo 1 Volksvagen Polo");
		carros.get(3).getModelos().add("Modelo 2 Volksvagen Polo");
	}
	
	public void action(){
		System.out.println("Carro...");
	}

	public List<CarroModel> getCarros() {
		return carros;
	}

	public void setCarros(List<CarroModel> carros) {
		this.carros = carros;
	}
	
}
