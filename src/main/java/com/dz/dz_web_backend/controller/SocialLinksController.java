package com.dz.dz_web_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dz.dz_web_backend.MODEL.SocialLinks;
import com.dz.dz_web_backend.service.SocialLinksService;

@RestController
@RequestMapping("/socialLinks")
public class SocialLinksController {
    private SocialLinksService socialLinksService;

    @Autowired
    public SocialLinksController(SocialLinksService socialLinksService) {
        this.socialLinksService = socialLinksService;
    }

    @GetMapping("/getall")
    public List<SocialLinks> getAllSocialLinks() {
        return socialLinksService.getAllSocialLinks();

    }

}
