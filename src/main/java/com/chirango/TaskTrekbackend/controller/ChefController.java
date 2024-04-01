package com.chirango.TaskTrekbackend.controller;

import com.chirango.TaskTrekbackend.dto.ChefRequest;
import com.chirango.TaskTrekbackend.entity.Chef;
import com.chirango.TaskTrekbackend.service.ChefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ChefController {

    @Autowired
    private ChefService chefService;

    @PostMapping(path = "/chefs")
    public Chef saveChef(@RequestBody ChefRequest chefRequest) {
        return chefService.saveChef(chefRequest);
    }

    @GetMapping(path = "/chefs")
    public List<Chef> getChefList() {
        return chefService.getChefList();
    }

    @GetMapping(path = "/chef/{id}")
    public Optional<Chef> getChefById(@PathVariable("id") Long chefId) {
        return chefService.getChefById(chefId);
    }

    @PutMapping(path = "/chef/{id}")
    public Chef updateChefById(
            @PathVariable("id") Long chefId, @RequestBody ChefRequest chefRequest) {
        return chefService.updateChefById(chefId, chefRequest);
    }

    @DeleteMapping(path = "/chef/{id}")
    public String deleteChefById(@PathVariable("id") Long chefId) {
        return chefService.deleteChefById(chefId);
    }
}
