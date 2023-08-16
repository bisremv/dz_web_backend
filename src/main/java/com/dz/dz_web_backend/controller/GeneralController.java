package com.dz.dz_web_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dz.dz_web_backend.MODEL.General;
import com.dz.dz_web_backend.service.GeneralService;

@RestController
@RequestMapping("/General")
public class GeneralController {
    private GeneralService generalService;

    @Autowired
    public GeneralController(GeneralService generalService) {
        this.generalService = generalService;
    }

    @GetMapping("/getall/{category}")
    public List<General> getAllGeneral(@PathVariable String category) {
        return generalService.getAllGeneral(category);
    }

}
