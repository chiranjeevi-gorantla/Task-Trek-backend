package com.chirango.TaskTrekbackend.repository;


import com.chirango.TaskTrekbackend.entity.Chef;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChefRepository extends JpaRepository<Chef, Long> {
}
