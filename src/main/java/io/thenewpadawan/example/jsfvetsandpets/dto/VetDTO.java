package io.thenewpadawan.example.jsfvetsandpets.dto;

import java.util.Date;

import lombok.Data;

@Data
public class VetDTO {
	private String firstname;
	private String lastname;
	private String fiscalCode;
	private Date birthday;
}
