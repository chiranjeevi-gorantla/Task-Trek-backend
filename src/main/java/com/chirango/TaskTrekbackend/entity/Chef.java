package com.chirango.TaskTrekbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "CHEF")
public class Chef {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long chefId;

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String status;

    @OneToOne(mappedBy = "chef")
    private Assignment assignment;

    @OneToOne(mappedBy = "chef")
    private Notification notification;
}
