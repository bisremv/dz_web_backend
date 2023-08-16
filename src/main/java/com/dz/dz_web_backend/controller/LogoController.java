package com.dz.dz_web_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

}
