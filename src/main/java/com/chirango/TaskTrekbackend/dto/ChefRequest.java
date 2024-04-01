package com.chirango.TaskTrekbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChefRequest {
    private Long chefId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String status;
}
