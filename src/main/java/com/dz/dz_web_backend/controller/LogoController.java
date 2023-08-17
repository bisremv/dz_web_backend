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

import com.dz.dz_web_backend.MODEL.Logo;
import com.dz.dz_web_backend.service.LogoService;

@RestController
@RequestMapping("/logo")
public class LogoController {
    private LogoService logoService;

    @Autowired
    public LogoController(LogoService logoService) {
        this.logoService = logoService;
    }

    @GetMapping("/getall")
    public List<Logo> getAllLogo() {
        return logoService.getAllLogo();
    }

    @GetMapping("/getbyid/{id}")
    public Optional<Logo> getLogoByID(@PathVariable int id) {
        return logoService.getLogoByID(id);
    }

    @PostMapping("/set")
    public void setAllLogo(@RequestBody List<Logo> logo) {
        logoService.setAllLogo(logo);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteLogoById(@PathVariable int id) {
        logoService.deleteLogoById(id);
    }

    @PutMapping("/edit")
    public void editLogoById(@RequestBody Logo logo) {
        logoService.editLogoById(logo);
    }

}
