package com.chirango.TaskTrekbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "ASSIGNMENT")
public class Assignment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long assignmentId;

    @OneToOne
    @JoinColumn(name = "chef_id")
    private Chef chef;

    private String dayOfWeek;
    private String assignedDate;
    private String dishName;
    private Date timestamp;
}
