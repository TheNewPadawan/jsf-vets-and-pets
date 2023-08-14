package io.thenewpadawan.example.jsfvetsandpets.controller;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import io.thenewpadawan.example.jsfvetsandpets.mapper.VetMapper;
import io.thenewpadawan.example.jsfvetsandpets.model.Vet;

@ManagedBean(name = "vet")
@SessionScoped
public class VetBean implements Serializable {
	private static final long serialVersionUID = 4209675487790199042L;
	private String vetBeanTest = "vetBeanTest";
	
	public VetBean() {
		Vet vet = new Vet("Andrea", "Rossi", "ADR46ETD82H", new Date());
		vetBeanTest = VetMapper.INSTANCE.entity(vet).toString();
	}
	
	public String getVetBeanTest(){
		return vetBeanTest;
	}
	
	public void setVetBeanTest(String vetBeanTest) {
		this.vetBeanTest = vetBeanTest;
	}
}
