package com.dz.dz_web_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dz.dz_web_backend.MODEL.Phones;
import com.dz.dz_web_backend.service.PhonesService;

@RestController
@RequestMapping("/phone")
public class PhonesController {
    private PhonesService phonesService;

    @Autowired
    public PhonesController(PhonesService phonesService) {
        this.phonesService = phonesService;
    }

    @GetMapping("/getall")
    public List<Phones> getAllPhones() {
        return phonesService.getAllPhones();

    }

}
