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
import com.dz.dz_web_backend.MODEL.Projects;
import com.dz.dz_web_backend.service.ProjectsService;

@RestController
@RequestMapping("/project")
public class ProjectsController {
    private ProjectsService projectsService;

    @Autowired
    public ProjectsController(ProjectsService projectsService) {
        this.projectsService = projectsService;
    }

    @GetMapping("/getall")
    public List<Projects> getAllProjects() {
        return projectsService.getAllProjects();

    }

    @GetMapping("/getbyid/{id}")
    public Optional<Projects> getProjectsByID(@PathVariable int id) {
        return projectsService.getProjectsByID(id);
    }

    @PostMapping("/set")
    public void setProjects(@RequestBody Projects projects) {
        projectsService.setProjects(projects);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProjectsById(@PathVariable int id) {
        projectsService.deleteProjectsById(id);
    }

    @PutMapping("/edit")
    public void editProjectsById(@RequestBody Projects projects) {
        projectsService.editProjectsById(projects);
    }
}
