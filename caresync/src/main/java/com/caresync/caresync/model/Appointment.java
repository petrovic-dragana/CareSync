package com.caresync.caresync.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {
    private Long id;
    private LocalDateTime dateTime;
    private Patient patient;
    private Doctor doctor;
    private MedicalService service;
    private ClinicBranch branch;
    private String status;

}
