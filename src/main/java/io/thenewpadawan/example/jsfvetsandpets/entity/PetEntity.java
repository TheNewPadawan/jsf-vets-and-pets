package io.thenewpadawan.example.jsfvetsandpets.entity;

import lombok.Data;

@Data
public class PetEntity {
	private String name;
	private String breed;
	private Integer old;
	private Boolean domestic;
}
