package com.caresync.caresync.controller;

import com.caresync.caresync.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @GetMapping("/doctors")
    public String showDoctors(Model model) {
        // Šaljemo listu doktora u Thymeleaf pod imenom "sviDoktori"
        model.addAttribute("sviDoktori", doctorService.getAllDoctors());
        return "doctors-list"; // Ovo je naziv HTML fajla koji ćemo napraviti
    }
}
