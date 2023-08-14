package io.thenewpadawan.example.jsfvetsandpets.entity;

import java.sql.Date;

import lombok.Data;

@Data
public class VetEntity {
	private String firstname;
	private String lastname;
	private String fiscalCode;
	private Date birthday;
}
