package com.chirango.TaskTrekbackend.mapper;

import com.chirango.TaskTrekbackend.dto.AssignmentRequest;
import com.chirango.TaskTrekbackend.entity.Assignment;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AssignmentMapper {
    AssignmentMapper INSTANCE = Mappers.getMapper(AssignmentMapper.class);

    AssignmentRequest AssignmentToAssignmentRequest(Assignment chef);

    Assignment AssignmentRequestToAssignment(AssignmentRequest assignmentRequest);
}
