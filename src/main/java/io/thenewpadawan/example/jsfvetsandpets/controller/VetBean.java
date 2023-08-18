package io.thenewpadawan.example.jsfvetsandpets.controller;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.*;

import io.thenewpadawan.example.jsfvetsandpets.mapper.VetMapper;
import io.thenewpadawan.example.jsfvetsandpets.model.Vet;
import lombok.Getter;
import lombok.Setter;

@ManagedBean(name = "vetbean")
@RequestScoped
@Getter
@Setter
public class VetBean implements Serializable {
	private static final long serialVersionUID = 4209675487790199042L;
	private String vetBeanTest = "vetBeanTest";
	
	public VetBean() {
		Vet vet = new Vet("Andrea", "Rossi", "ADR46ETD82H", new Date());
		vetBeanTest = VetMapper.INSTANCE.entity(vet).toString();
	}
}
