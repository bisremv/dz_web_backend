package com.dz.dz_web_backend.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dz.dz_web_backend.MODEL.Experience;
import com.dz.dz_web_backend.dao.ExperienceDao;

@Service
public class ExperienceService {

    private ExperienceDao experienceDao;

    @Autowired
    public ExperienceService(ExperienceDao experienceDao) {
        this.experienceDao = experienceDao;
    }

    public List<Experience> getAllExperience() {
        return (List<Experience>) experienceDao.findAll();
    }

}
