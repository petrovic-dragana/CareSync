package com.caresync.caresync.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {
    private Long id;
    private int rating;
    private String comment;
    private Long appointmentId;
    private String patientName;


}
