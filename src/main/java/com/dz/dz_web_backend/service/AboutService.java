package com.dz.dz_web_backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dz.dz_web_backend.MODEL.About;
import com.dz.dz_web_backend.MODEL.About;
import com.dz.dz_web_backend.dao.AboutDao;

@Service
public class AboutService {

    private AboutDao aboutDao;

    @Autowired
    public AboutService(AboutDao aboutDao) {
        this.aboutDao = aboutDao;
    }

    public List<About> getAllAbout() {
        return (List<About>) aboutDao.findAll();
    }

    public void setAllAbout(List<About> about) {
        aboutDao.saveAll(about);

    }

    public void deleteAboutById(int id) {
        aboutDao.deleteById(id);
    }

    public void editAboutById(About about) {
        aboutDao.save(about);

    }

    public Optional<About> getAboutByID(int id) {
        return aboutDao.findById(id);
    }

}
