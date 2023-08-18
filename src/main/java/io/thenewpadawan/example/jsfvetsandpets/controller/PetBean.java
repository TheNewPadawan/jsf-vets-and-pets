package io.thenewpadawan.example.jsfvetsandpets.controller;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
//import javax.enterprice.context.RequestScoped;
import javax.faces.bean.*;
//import javax.inject.Named;
import javax.faces.context.FacesContext;

import io.thenewpadawan.example.jsfvetsandpets.dto.PetDTO;
import io.thenewpadawan.example.jsfvetsandpets.mapper.PetMapper;
import io.thenewpadawan.example.jsfvetsandpets.model.Pet;
import lombok.Getter;
import lombok.Setter;

@ManagedBean(name = "petbean")
//@SessionScoped
@RequestScoped
@Getter
@Setter
public class PetBean implements Serializable{
	private static final long serialVersionUID = -4946871615482319785L;
	private String petBeanTest = "petBeanTest";
	private PetDTO dto = new PetDTO();
//	private String name;
//	private String breed;
//	private Integer old;
//	private Boolean wild;
	
	public PetBean() {
		Pet pet = new Pet("alan", "cane", 0, true);
		petBeanTest = PetMapper.INSTANCE.entity(pet).toString();
//		FacesContext context = FacesContext.getCurrentInstance();
	}
	
	public void createPet() {
		FacesContext context = FacesContext.getCurrentInstance();
//		FacesMessage msg1 = new FacesMessage(FacesMessage.SEVERITY_INFO, "Employee Information is stored Successfully.", "Success detail");
//		FacesMessage msg2 = new FacesMessage(FacesMessage.SEVERITY_ERROR, dto.toString(), "name detail");
//		context.addMessage(null, msg1);
//		context.addMessage(null, msg2);
		dto.setName("stocazzo");
	}
}
