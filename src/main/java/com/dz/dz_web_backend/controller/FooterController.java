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

import com.dz.dz_web_backend.MODEL.Footer;
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

    @GetMapping("/getbyid/{id}")
    public Optional<Footer> getFooterByID(@PathVariable int id) {
        return footerService.getFooterByID(id);
    }

    @PostMapping("/set")
    public void setAllFooter(@RequestBody List<Footer> footer) {
        footerService.setAllFooter(footer);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFooterById(@PathVariable int id) {
        footerService.deleteFooterById(id);
    }

    @PutMapping("/edit")
    public void editFooterById(@RequestBody Footer footer) {
        footerService.editFooterById(footer);
    }
}
