package io.thenewpadawan.example.jsfvetsandpets.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Pet {
	@NonNull
	private String name;
	@NonNull
	private String breed;
	@Setter(value = AccessLevel.NONE)
	private int age = 0;
	private boolean domestic = true;
		
	public void growingOld() {
		age++;
	}
}
