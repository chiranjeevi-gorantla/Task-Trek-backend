package com.chirango.TaskTrekbackend.controller;


import com.chirango.TaskTrekbackend.dto.AssignmentRequest;
import com.chirango.TaskTrekbackend.entity.Assignment;
import com.chirango.TaskTrekbackend.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AssignmentController {
    @Autowired
    private AssignmentService assignmentService;

    @PostMapping("/assignments")
    public Assignment saveAssignment(@RequestBody AssignmentRequest assignmentRequest) {
        return assignmentService.saveAssignment(assignmentRequest);
    }

    @GetMapping(path = "/assignments")
    public List<Assignment> getAssignmentList() {
        return assignmentService.getAssignmentList();
    }

    @GetMapping(path = "/assignment/{id}")
    public Optional<Assignment> getAssignmentById(@PathVariable("id") Long assignmentId) {
        return assignmentService.getAssignmentById(assignmentId);
    }

    @PutMapping(path = "/assignment/{id}")
    public Assignment updateAssignmentById(
            @PathVariable("id") Long assignmentId, @RequestBody AssignmentRequest assignmentRequest) {
        return assignmentService.updateAssignmentById(assignmentId, assignmentRequest);
    }

    @DeleteMapping(path = "/assignment/{id}")
    public String deleteAssignmentById(@PathVariable("id") Long assignmentId) {
        return assignmentService.deleteAssignmentById(assignmentId);
    }
}
