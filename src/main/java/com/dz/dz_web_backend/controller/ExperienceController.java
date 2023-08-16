package com.dz.dz_web_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dz.dz_web_backend.MODEL.Experience;
import com.dz.dz_web_backend.service.ExperienceService;

@RestController
@RequestMapping("/experience")
public class ExperienceController {
    private ExperienceService experienceService;

    @Autowired
    public ExperienceController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }

    @GetMapping("/getall")
    public List<Experience> getAllExperience() {
        return experienceService.getAllExperience();
    }
}
