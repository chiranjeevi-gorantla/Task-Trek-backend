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
@Table(name = "NOTIFICATION")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long notificationId;

    @OneToOne
    @JoinColumn(name = "chef_id")
    private Chef chef;
    private String notificationType;
    private String status;
    private String timestamp;
}
