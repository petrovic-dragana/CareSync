package com.caresync.caresync.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HealthRecord {
    private Long id;
    private Long patientId;
    private Long doctorId;
    private LocalDate entryDate;
    private String diagnosis;
    private String therapy;
    private String notes;
}
