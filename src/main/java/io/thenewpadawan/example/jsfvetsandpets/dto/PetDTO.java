package io.thenewpadawan.example.jsfvetsandpets.dto;

import java.util.regex.Pattern;

import lombok.Data;

@Data
public class PetDTO {
	public static final Pattern NAME_PATTERN = Pattern.compile("^[A-Z]{2,45}$", Pattern.CASE_INSENSITIVE);
	public static final Pattern BREED_PATTERN = Pattern.compile("^[A-Z]{6,45}$", Pattern.CASE_INSENSITIVE);
	
	private String name;
	private String breed;
	private Integer old;
	private Boolean wild;
//	private String gender;	
}
