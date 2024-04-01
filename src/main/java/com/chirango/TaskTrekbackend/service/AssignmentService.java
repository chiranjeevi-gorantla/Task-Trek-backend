package com.chirango.TaskTrekbackend.service;


import com.chirango.TaskTrekbackend.dto.AssignmentRequest;
import com.chirango.TaskTrekbackend.entity.Assignment;

import java.util.List;
import java.util.Optional;

public interface AssignmentService {
    Assignment saveAssignment(AssignmentRequest assignmentRequest);

    List<Assignment> getAssignmentList();

    Optional<Assignment> getAssignmentById(Long assignmentId);

    Assignment updateAssignmentById(Long assignmentId, AssignmentRequest assignmentRequest);

    String deleteAssignmentById(Long assignmentId);
}
