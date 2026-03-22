package com.caresync.caresync.controller;

import com.caresync.caresync.model.Appointment;
import com.caresync.caresync.model.HealthRecord;
import com.caresync.caresync.service.AppointmentService;
import com.caresync.caresync.service.DoctorService;
import com.caresync.caresync.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/appointments")
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;

    @Autowired
    private PatientService patientService;

    @Autowired
    private DoctorService doctorService;

    @GetMapping
    public String listAppointments(Model model) {
        model.addAttribute("appointments", appointmentService.getAllAppointments());
        return "appointments/list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("appointment", new Appointment());
        // Šaljemo liste za padajuće menije
        model.addAttribute("allPatients", patientService.getAllPatients());
        model.addAttribute("allDoctors", doctorService.getAllDoctors());
        return "appointments/add-form";
    }

    @PostMapping("/save")
    public String saveAppointment(@ModelAttribute("appointment") Appointment appointment) {
        appointmentService.saveAppointment(appointment);
        return "redirect:/appointments";
    }
    @GetMapping("/complete/{id}")
    public String completeAppointment(@PathVariable Long id, Model model) {
        // Pronađemo termin (u praksi bi ovde išao servis, ali za sada može direktno iz storage-a)
        // Simuliramo prelazak na formu za HealthRecord
        HealthRecord newRecord = new HealthRecord();
        // Automatski povezujemo karton sa pacijentom iz tog termina
        model.addAttribute("record", newRecord);
        model.addAttribute("appointmentId", id);
        return "health-records/add-form";
    }
}
