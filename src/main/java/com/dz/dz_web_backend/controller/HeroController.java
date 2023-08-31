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

import com.dz.dz_web_backend.MODEL.Hero;
import com.dz.dz_web_backend.MODEL.Hero;
import com.dz.dz_web_backend.service.HeroService;

@RestController
@RequestMapping("/hero")
public class HeroController {
    private HeroService heroService;

    @Autowired
    public HeroController(HeroService heroService) {
        this.heroService = heroService;
    }

    @GetMapping("/getall")
    public List<Hero> getAllHero() {
        return heroService.getAllHero();

    }

    @GetMapping("/getbyid/{id}")
    public Optional<Hero> getHeroByID(@PathVariable int id) {
        return heroService.getHeroByID(id);
    }

    @PostMapping("/set")
    public void setAllHero(@RequestBody Hero hero) {
        heroService.setHero(hero);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteHeroById(@PathVariable int id) {
        heroService.deleteHeroById(id);
    }

    @PutMapping("/edit")
    public void editHeroById(@RequestBody Hero hero) {
        heroService.editHeroById(hero);
    }
}
