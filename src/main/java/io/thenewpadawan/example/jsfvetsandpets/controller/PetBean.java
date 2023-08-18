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
	
	public PetBean() {
		Pet pet = new Pet("alan", "cane", 0, true);
		petBeanTest = PetMapper.INSTANCE.entity(pet).toString();
	}
	
	public String createPet() {
		FacesContext context = FacesContext.getCurrentInstance();
		boolean success = true;
		if (!PetDTO.NAME_PATTERN.matcher(dto.getName()).find()) {
			FacesMessage msgName = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Il nome deve avere almeno 2 caratteri e massimo 45", dto.getName());
			context.addMessage(null, msgName);
			success = false;
		}
		if (!PetDTO.BREED_PATTERN.matcher(dto.getBreed()).find()) {
			FacesMessage msgBreed = new FacesMessage(FacesMessage.SEVERITY_ERROR, "La razza deve avere almeno 6 caratteri e massimo 45", dto.getName());
			context.addMessage(null, msgBreed);
			success = false;
		}
		if (dto.getOld() < 0) {
			FacesMessage msgOld = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Cosa hai fatto a questo animale?!", dto.getOld().toString());
			context.addMessage(null, msgOld);
			success = false;
		}
		return success ? "pet-create-success" : null;
	}
}
