package com.caresync.caresync.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedicalService {
    private Long id;
    private String name;
    private double price;
    private int durationMinutes;

}
