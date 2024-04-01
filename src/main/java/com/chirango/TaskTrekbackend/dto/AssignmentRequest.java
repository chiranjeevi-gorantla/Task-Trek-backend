package com.chirango.TaskTrekbackend.dto;

import com.chirango.TaskTrekbackend.entity.Chef;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssignmentRequest {
    private Long assignmentId;
    private Chef chef;
    private String dayOfWeek;
    private Date assignedDate;
    private String dishName;
    private Date timestamp;
}
