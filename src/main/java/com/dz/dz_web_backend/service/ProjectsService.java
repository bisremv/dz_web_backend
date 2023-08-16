package com.dz.dz_web_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dz.dz_web_backend.MODEL.Projects;
import com.dz.dz_web_backend.dao.ProjectsDao;

@Service
public class ProjectsService {
    private ProjectsDao projectsDao;

    @Autowired
    public ProjectsService(ProjectsDao projectsDao) {
        this.projectsDao = projectsDao;
    }

    public List<Projects> getAllProjects() {
        return (List<Projects>) projectsDao.findAll();
    }
}
