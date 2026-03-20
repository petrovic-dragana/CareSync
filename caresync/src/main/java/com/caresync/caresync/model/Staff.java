package com.caresync.caresync.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Staff {
    private Long id;
    private String firstName;
    private String lastName;
    private String role;
    private String employeeId;
}
