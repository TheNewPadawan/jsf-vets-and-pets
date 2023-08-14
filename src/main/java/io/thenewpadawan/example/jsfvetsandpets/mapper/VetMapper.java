package io.thenewpadawan.example.jsfvetsandpets.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import io.thenewpadawan.example.jsfvetsandpets.dto.VetDTO;
import io.thenewpadawan.example.jsfvetsandpets.entity.VetEntity;
import io.thenewpadawan.example.jsfvetsandpets.model.Vet;

@Mapper//(componentModel = "spring")
public interface VetMapper {
	VetMapper INSTANCE = Mappers.getMapper(VetMapper.class);
	
	Vet model(VetDTO dto);

	VetEntity entity(Vet model);
	
	Vet model(VetEntity entity);
	
	VetDTO dto(Vet model);
	
	default VetEntity entity(VetDTO dto) {
		return entity(model(dto));
	}
	
	default VetDTO dto(VetEntity entity) {
		return dto(model(entity));
	}	
}
