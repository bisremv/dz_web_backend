package com.dz.dz_web_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

}
