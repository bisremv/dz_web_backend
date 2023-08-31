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

    @GetMapping("/getbyid/{id}")
    public Optional<Leaders> getLeadersByID(@PathVariable int id) {
        return leadersService.getLeadersByID(id);
    }

    @PostMapping("/set")
    public void setAllLeaders(@RequestBody Leaders leaders) {
        leadersService.setAllLeaders(leaders);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteLeadersById(@PathVariable int id) {
        leadersService.deleteLeadersById(id);
    }

    @PutMapping("/edit")
    public void editLeadersById(@RequestBody Leaders leaders) {
        leadersService.editLeadersById(leaders);
    }
}
