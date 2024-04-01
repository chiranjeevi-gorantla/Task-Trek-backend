package com.chirango.TaskTrekbackend.service;


import com.chirango.TaskTrekbackend.dto.ChefRequest;
import com.chirango.TaskTrekbackend.entity.Chef;

import java.util.List;
import java.util.Optional;

public interface ChefService {
    Chef saveChef(ChefRequest chefRequest);

    List<Chef> getChefList();

    Optional<Chef> getChefById(Long chefId);

    Chef updateChefById(Long chefId, ChefRequest chefRequest);

    String deleteChefById(Long chefId);
}
