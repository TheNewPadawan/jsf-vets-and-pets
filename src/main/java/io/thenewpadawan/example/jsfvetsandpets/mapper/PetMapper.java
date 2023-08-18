package io.thenewpadawan.example.jsfvetsandpets.mapper;

import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import io.thenewpadawan.example.jsfvetsandpets.dto.PetDTO;
import io.thenewpadawan.example.jsfvetsandpets.entity.PetEntity;
import io.thenewpadawan.example.jsfvetsandpets.model.Pet;

@Mapper//(componentModel = "spring")
public interface PetMapper {
	PetMapper INSTANCE = Mappers.getMapper(PetMapper.class);

	@Mappings({
		@Mapping(source = "old", target = "age"/*, conditionExpression = "java(dto.getOld() != null)"*/),
		@Mapping(source = "wild", target = "domestic"/*, conditionExpression = "java(dto.getWild() != null)"*/)
	})
	Pet model(PetDTO dto);
	
	@Mappings({
		@Mapping(source = "age", target = "old")
	})
	PetEntity entity(Pet model);
	
	@Mappings({
		@Mapping(source = "old", target = "age"/*, conditionExpression = "java(entity.getOld() != null)"*/),
		@Mapping(source = "domestic", target = "domestic"/*, conditionExpression = "java(entity.getDomestic() != null)"*/)
	})
	Pet model(PetEntity entity);
	
	@Mappings({
		@Mapping(source = "age", target = "old"),
		@Mapping(source = "domestic", target = "wild")
	})
	PetDTO dto(Pet model);
	
	default PetEntity entity(PetDTO dto) {
		return entity(model(dto));
	}
	
	default PetDTO dto(PetEntity entity) {
		return dto(model(entity));
	}
}
