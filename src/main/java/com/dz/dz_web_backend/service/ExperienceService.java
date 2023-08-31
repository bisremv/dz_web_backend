package com.dz.dz_web_backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dz.dz_web_backend.MODEL.Experience;
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

    public void setExperience(Experience experience) {
        experienceDao.save(experience);

    }

    public void deleteExperienceById(int id) {
        experienceDao.deleteById(id);
    }

    public void editExperienceById(Experience experience) {
        experienceDao.save(experience);

    }

    public Optional<Experience> getExperienceByID(int id) {
        return experienceDao.findById(id);
    }
}
