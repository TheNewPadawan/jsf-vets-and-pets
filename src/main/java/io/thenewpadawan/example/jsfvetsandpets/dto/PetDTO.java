package io.thenewpadawan.example.jsfvetsandpets.dto;

import lombok.Data;

@Data
public class PetDTO {
	private String name;
	private String breed;
	private Integer old;
	private Boolean wild;
//	private String gender;
}
