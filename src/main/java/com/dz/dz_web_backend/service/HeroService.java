package com.dz.dz_web_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dz.dz_web_backend.MODEL.Hero;
import com.dz.dz_web_backend.dao.HeroDao;

@Service
public class HeroService {

    private HeroDao heroDao;

    @Autowired
    public HeroService(HeroDao heroDao) {
        this.heroDao = heroDao;
    }

    public List<Hero> getAllHero() {
        return (List<Hero>) heroDao.findAll();
    }

}
