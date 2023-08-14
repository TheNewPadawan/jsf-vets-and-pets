package io.thenewpadawan.example.jsfvetsandpets.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data 
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Vet {
	@NonNull
	private String firstname;
	@NonNull
	private String lastname;
	@NonNull
	private String fiscalCode;
	private Date birthday;
}
