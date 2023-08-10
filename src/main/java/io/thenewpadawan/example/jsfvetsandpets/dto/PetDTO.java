package io.thenewpadawan.example.jsfvetsandpets.dto;

public class PetDTO {
	private String name;
	private String breed;
	private Integer old;
	private Boolean wild;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public Integer getOld() {
		return old;
	}
	
	public void setOld(Integer old) {
		this.old = old;
	}
	
	public Boolean getWild() {
		return wild;
	}
	
	public void setWild(Boolean wild) {
		this.wild = wild;
	}	
}
