package io.thenewpadawan.example.jsfvetsandpets.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "vet")
@SessionScoped
public class VetBean implements Serializable {
	private static final long serialVersionUID = 4209675487790199042L;

	private String vetBeanTest = "vetBeanTest";
	
	public String getVetBeanTest(){
		return vetBeanTest;
	}
	
	public void setVetBeanTest(String vetBeanTest) {
		this.vetBeanTest = vetBeanTest;
	}
}
