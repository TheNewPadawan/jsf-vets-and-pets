package io.thenewpadawan.example.jsfvetsandpets.entity;

public class PetEntity {
	private String name;
	private String breed;
	private Integer old;
	private Boolean domestic;
	
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
	
	public Boolean getDomestic() {
		return domestic;
	}
	
	public void setDomestic(Boolean domestic) {
		this.domestic = domestic;
	}
}
