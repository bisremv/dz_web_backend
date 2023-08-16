package com.dz.dz_web_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
