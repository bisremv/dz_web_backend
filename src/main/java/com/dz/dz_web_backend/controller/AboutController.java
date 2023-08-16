package com.dz.dz_web_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dz.dz_web_backend.MODEL.About;
import com.dz.dz_web_backend.service.AboutService;

@RestController
@RequestMapping("/about")
public class AboutController {

    private AboutService aboutService;

    @Autowired
    public AboutController(AboutService aboutService) {
        this.aboutService = aboutService;
    }

    @GetMapping("/getall")
    public List<About> getAllAbout() {
        return aboutService.getAllAbout();
    }
}
