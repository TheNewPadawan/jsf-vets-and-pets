package io.thenewpadawan.example.jsfvetsandpets.mapper;

import java.sql.Date;
import java.sql.Timestamp;

import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import io.thenewpadawan.example.jsfvetsandpets.dto.VetDTO;
import io.thenewpadawan.example.jsfvetsandpets.entity.VetEntity;
import io.thenewpadawan.example.jsfvetsandpets.model.Vet;

@Mapper//(componentModel = "spring")
public interface VetMapper {
	VetMapper INSTANCE = Mappers.getMapper(VetMapper.class);
	
	Vet model(VetDTO dto);

	@Mappings({
		@Mapping(source = "birthday", target = "birthday", qualifiedByName = "castToTimestamp")
	})
	VetEntity entity(Vet model);
	
	@Mappings({
		@Mapping(source = "birthday", target = "birthday", qualifiedByName = "castToDate")
	})
	Vet model(VetEntity entity);
	
	VetDTO dto(Vet model);
	
	default VetEntity entity(VetDTO dto) {
		return entity(model(dto));
	}
	
	default VetDTO dto(VetEntity entity) {
		return dto(model(entity));
	}
	
	@Named(value = "castToTimestamp")
	default Timestamp castDateToTimestamp(Date date) {
		return new Timestamp(date.getTime());
	}
	
	@Named(value = "castToDate")
	default Date castDateToTimestamp(Timestamp timestamp) {
		//tutta la magia che ci pare per fare il cast che dobbiamo fare
		return new Date(timestamp.getTime());
	}
}
