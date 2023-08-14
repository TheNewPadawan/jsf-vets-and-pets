package io.thenewpadawan.example.jsfvetsandpets.entity;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class VetEntity {
	private String firstname;
	private String lastname;
	private String fiscalCode;
	private Timestamp birthday;
}
