package com.dz.dz_web_backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dz.dz_web_backend.MODEL.Hero;
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

    public void setAllHero(List<Hero> hero) {
        heroDao.saveAll(hero);

    }

    public void deleteHeroById(int id) {
        heroDao.deleteById(id);
    }

    public void editHeroById(Hero hero) {
        heroDao.save(hero);

    }

    public Optional<Hero> getHeroByID(int id) {
        return heroDao.findById(id);
    }
}
