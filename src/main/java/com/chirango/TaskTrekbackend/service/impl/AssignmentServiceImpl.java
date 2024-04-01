package com.chirango.TaskTrekbackend.service.impl;

import com.chirango.TaskTrekbackend.dto.AssignmentRequest;
import com.chirango.TaskTrekbackend.entity.Assignment;
import com.chirango.TaskTrekbackend.mapper.AssignmentMapper;
import com.chirango.TaskTrekbackend.repository.AssignmentRepository;
import com.chirango.TaskTrekbackend.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class AssignmentServiceImpl implements AssignmentService {

    @Autowired
    private AssignmentRepository assignmentRepository;

    @Autowired
    private AssignmentMapper assignmentMapper;

    @Override
    public Assignment saveAssignment(AssignmentRequest assignmentRequest) {
        Assignment assignment = assignmentMapper.AssignmentRequestToAssignment(assignmentRequest);
        return assignmentRepository.save(assignment);
    }

    @Override
    public List<Assignment> getAssignmentList() {
        return assignmentRepository.findAll();
    }

    @Override
    public Optional<Assignment> getAssignmentById(Long assignmentId) {
        return assignmentRepository.findById(assignmentId);
    }

    @Override
    public Assignment updateAssignmentById(Long assignmentId, AssignmentRequest assignmentRequest) {
        Assignment assignment = assignmentRepository.findById(assignmentId).get();

        if (Objects.nonNull(assignmentRequest.getDayOfWeek())
                && !"".equalsIgnoreCase(assignmentRequest.getDayOfWeek())) {
            assignment.setDayOfWeek(assignmentRequest.getDayOfWeek());
        }

        if (Objects.nonNull(assignmentRequest.getDishName())
                && !"".equalsIgnoreCase(assignmentRequest.getDishName())) {
            assignment.setDishName(assignmentRequest.getDishName());
        }

        if (Objects.nonNull(assignmentRequest.getAssignedDate())
                && !"".equalsIgnoreCase(String.valueOf(assignmentRequest.getAssignedDate()))) {
            assignment.setAssignedDate(String.valueOf(assignmentRequest.getAssignedDate()));
        }

        if (Objects.nonNull(assignmentRequest.getAssignmentId())
                && !"".equalsIgnoreCase(String.valueOf(assignmentRequest.getAssignmentId()))) {
            assignment.setAssignmentId(assignmentRequest.getAssignmentId());
        }

        if (Objects.nonNull(assignmentRequest.getChef())) {
            assignment.setChef(assignmentRequest.getChef());
        }

        return assignmentRepository.save(assignment);
    }

    @Override
    public String deleteAssignmentById(Long assignmentId) {
        assignmentRepository.deleteById(assignmentId);
        return "Assignment deleted successfully";
    }
}
