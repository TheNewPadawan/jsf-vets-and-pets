package io.thenewpadawan.example.jsfvetsandpets.controller;

import java.io.Serializable;

//import javax.enterprice.context.RequestScoped;
import javax.faces.bean.*;
//import javax.inject.Named;

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
	private String name;
	private String breed;
	private Integer old;
	private Boolean wild;
	
	public PetBean() {
		Pet pet = new Pet("alan", "cane", 0, true);
		petBeanTest = PetMapper.INSTANCE.entity(pet).toString();
	}
}
