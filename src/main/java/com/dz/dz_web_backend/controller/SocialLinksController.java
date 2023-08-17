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

import com.dz.dz_web_backend.MODEL.SocialLinks;
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

    @GetMapping("/getbyid/{id}")
    public Optional<SocialLinks> getSocialLinksByID(@PathVariable int id) {
        return socialLinksService.getSocialLinksByID(id);
    }

    @PostMapping("/set")
    public void setAllSocialLinks(@RequestBody List<SocialLinks> socialLinks) {
        socialLinksService.setAllSocialLinks(socialLinks);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSocialLinksById(@PathVariable int id) {
        socialLinksService.deleteSocialLinksById(id);
    }

    @PutMapping("/edit")
    public void editSocialLinksById(@RequestBody SocialLinks socialLinks) {
        socialLinksService.editSocialLinksById(socialLinks);
    }
}
