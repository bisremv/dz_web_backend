package com.dz.dz_web_backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @GetMapping("/getbyid/{id}")
    public Optional<Experience> getExperienceByID(@PathVariable int id) {
        return experienceService.getExperienceByID(id);
    }

    @PostMapping("/set")
    public void setAllExperience(@RequestBody List<Experience> experience) {
        experienceService.setAllExperience(experience);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteExperienceById(@PathVariable int id) {
        experienceService.deleteExperienceById(id);
    }

    @PutMapping("/edit")
    public void editExperienceById(@RequestBody Experience experience) {
        experienceService.editExperienceById(experience);
    }
}
