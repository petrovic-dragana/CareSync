package com.caresync.caresync.service;

import com.caresync.caresync.model.Appointment;
import com.caresync.caresync.repository.DataStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {
    @Autowired
    private DataStorage storage;

    public List<Appointment> getAllAppointments() {
        return storage.getAppointments();
    }

    public void addAppointment(Appointment appointment) {
        // Ovde bi išla logika: npr. provera da li je lekar slobodan
        storage.getAppointments().add(appointment);
    }
}
