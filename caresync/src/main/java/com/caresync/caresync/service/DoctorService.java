package com.caresync.caresync.service;

import com.caresync.caresync.model.Doctor;
import com.caresync.caresync.repository.DataStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    private DataStorage storage;

    public List<Doctor> getAllDoctors() {
        return storage.getDoctors();
    }
}
