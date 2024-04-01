package com.chirango.TaskTrekbackend.mapper;

import com.chirango.TaskTrekbackend.dto.ChefRequest;
import com.chirango.TaskTrekbackend.entity.Chef;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ChefMapper {
    ChefMapper INSTANCE = Mappers.getMapper(ChefMapper.class);

    ChefRequest chefToChefRequest(Chef chef);

    Chef ChefRequestToChef(ChefRequest chefRequest);
}
