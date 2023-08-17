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

import com.dz.dz_web_backend.MODEL.About;
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

    @GetMapping("/getbyid/{id}")
    public Optional<About> getAboutByID(@PathVariable int id) {
        return aboutService.getAboutByID(id);
    }

    @PostMapping("/set")
    public void setAllAbout(@RequestBody List<About> about) {
        aboutService.setAllAbout(about);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAboutById(@PathVariable int id) {
        aboutService.deleteAboutById(id);
    }

    @PutMapping("/edit")
    public void editAboutById(@RequestBody About about) {
        aboutService.editAboutById(about);
    }
}
