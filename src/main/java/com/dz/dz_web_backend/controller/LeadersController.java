package com.dz.dz_web_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dz.dz_web_backend.MODEL.Leaders;
import com.dz.dz_web_backend.service.LeadersService;

@RestController
@RequestMapping("/leaders")
public class LeadersController {
    private LeadersService leadersService;

    @Autowired
    public LeadersController(LeadersService leadersService) {
        this.leadersService = leadersService;
    }

    @GetMapping("/getall")
    public List<Leaders> getAllLeaders() {
        return leadersService.getAllLeaders();

    }

}
