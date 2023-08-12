package io.thenewpadawan.example.jsfvetsandpets.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import io.thenewpadawan.example.jsfvetsandpets.model.Pet;

@ManagedBean(name = "pet")
@SessionScoped
public class PetBean implements Serializable{
	private static final long serialVersionUID = -4946871615482319785L;
	private String petBeanTest = "petBeanTest";
	
	public String getPetBeanTest() {
		return petBeanTest;
	}
	
	public void setPetBeanTest(String petBeanTest) {
		this.petBeanTest = petBeanTest;
	}

}
