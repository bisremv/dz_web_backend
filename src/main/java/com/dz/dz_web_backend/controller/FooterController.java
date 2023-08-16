package com.dz.dz_web_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dz.dz_web_backend.MODEL.About;
import com.dz.dz_web_backend.MODEL.Footer;
import com.dz.dz_web_backend.service.AboutService;
import com.dz.dz_web_backend.service.FooterService;

@RestController
@RequestMapping("/footer")
public class FooterController {

    private FooterService footerService;

    @Autowired
    public FooterController(FooterService footerService) {
        this.footerService = footerService;
    }

    @GetMapping("/getall")
    public List<Footer> getAllFooter() {
        return footerService.getAllFooter();
    }
}
