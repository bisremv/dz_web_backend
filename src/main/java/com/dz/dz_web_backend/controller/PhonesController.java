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

    @GetMapping("/getbyid/{id}")
    public Optional<Phones> getPhonesByID(@PathVariable int id) {
        return phonesService.getPhonesByID(id);
    }

    @PostMapping("/set")
    public void setAllPhones(@RequestBody Phones phones) {
        phonesService.setAllPhones(phones);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePhonesById(@PathVariable int id) {
        phonesService.deletePhonesById(id);
    }

    @PutMapping("/edit")
    public void editPhonesById(@RequestBody Phones phones) {
        phonesService.editPhonesById(phones);
    }

}
