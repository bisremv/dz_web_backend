package com.dz.dz_web_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
