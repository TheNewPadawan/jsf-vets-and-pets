package io.thenewpadawan.example.jsfvetsandpets.model;

public class Pet {
	private String name;
	private String breed;
	private int age = 0;
	private boolean domestic = true;
	
	public Pet() {}
	
	public Pet(String name, String breed, int age, boolean domestic) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.domestic = domestic;
	}
	
	public void growingOld() {
		age++;
	}

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

	public int getAge() {
		return age;
	}

	public boolean isDomestic() {
		return domestic;
	}

	public void setDomestic(boolean domestic) {
		this.domestic = domestic;
	}
}
