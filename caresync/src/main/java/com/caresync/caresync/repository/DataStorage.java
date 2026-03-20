package com.caresync.caresync.repository;

import com.caresync.caresync.model.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataStorage {
    private List<Patient> patients = new ArrayList<>();
    private List<Doctor> doctors = new ArrayList<>();
    private List<Staff> staffMembers = new ArrayList<>();
    private List<MedicalService> services = new ArrayList<>();
    private List<ClinicBranch> branches = new ArrayList<>();
    private List<Appointment> appointments = new ArrayList<>();
    private List<HealthRecord> healthRecords = new ArrayList<>();
    private List<Review> reviews = new ArrayList<>();

    public DataStorage() {
        seedData();
    }
    private void seedData() {
        branches.add(new ClinicBranch(1L, "CareSync Central", "Bulevar Oslobođenja 1", "Beograd", "011/123-456"));
        doctors.add(new Doctor(1L, "Marko", "Marković", "Kardiolog", "LIC-12345", 1L));
        services.add(new MedicalService(1L, "Sistematski pregled", 5000.0, 30));
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public List<Staff> getStaffMembers() {
        return staffMembers;
    }

    public List<MedicalService> getServices() {
        return services;
    }

    public List<ClinicBranch> getBranches() {
        return branches;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public List<HealthRecord> getHealthRecords() {
        return healthRecords;
    }

    public List<Review> getReviews() {
        return reviews;
    }
}
