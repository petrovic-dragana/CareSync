package com.caresync.caresync.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClinicBranch {
    private Long id;
    private String name;
    private String address;
    private String city;
    private String phoneNumber;
}
