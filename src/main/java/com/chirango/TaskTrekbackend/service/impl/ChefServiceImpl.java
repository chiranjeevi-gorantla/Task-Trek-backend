package com.chirango.TaskTrekbackend.service.impl;

import com.chirango.TaskTrekbackend.dto.ChefRequest;
import com.chirango.TaskTrekbackend.entity.Chef;
import com.chirango.TaskTrekbackend.mapper.ChefMapper;
import com.chirango.TaskTrekbackend.repository.ChefRepository;
import com.chirango.TaskTrekbackend.service.ChefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ChefServiceImpl implements ChefService {

    @Autowired
    private ChefRepository chefRepository;

    @Autowired
    private ChefMapper chefMapper;

    @Override
    public Chef saveChef(ChefRequest chefRequest) {
        Chef chef = chefMapper.ChefRequestToChef(chefRequest);
        return chefRepository.save(chef);
    }

    @Override
    public List<Chef> getChefList() {
        return chefRepository.findAll();
    }

    @Override
    public Optional<Chef> getChefById(Long chefId) {
        return chefRepository.findById(chefId);
    }

    @Override
    public Chef updateChefById(Long chefId, ChefRequest chefRequest) {
        Chef chef = chefRepository.findById(chefId).get();

        if (Objects.nonNull(chefRequest.getFirstName())
                && !"".equalsIgnoreCase(chefRequest.getFirstName())) {
            chef.setFirstName(chefRequest.getFirstName());
        }
        if (Objects.nonNull(chefRequest.getLastName())
                && !"".equalsIgnoreCase(chefRequest.getLastName())) {
            chef.setLastName(chefRequest.getLastName());
        }
        if (Objects.nonNull(chefRequest.getEmail()) && !"".equalsIgnoreCase(chefRequest.getEmail())) {
            chef.setEmail(chefRequest.getEmail());
        }
        if (Objects.nonNull(chefRequest.getPhoneNumber())
                && !"".equalsIgnoreCase(chefRequest.getPhoneNumber())) {
            chef.setPhoneNumber(chefRequest.getPhoneNumber());
        }
        if (Objects.nonNull(chefRequest.getStatus()) && !"".equalsIgnoreCase(chefRequest.getStatus())) {
            chef.setStatus(chefRequest.getStatus());
        }
        return chefRepository.save(chef);
    }

    @Override
    public String deleteChefById(Long chefId) {
        chefRepository.deleteById(chefId);
        return "Chef deleted successfully";
    }
}
