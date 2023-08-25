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

    @GetMapping("/getbyid/{id}")
    public Optional<General> getGeneralByID(@PathVariable int id) {
        return generalService.getGeneralByID(id);
    }

    @PostMapping("/set")
    public void setAllGeneral(@RequestBody General general) {
        generalService.setAllGeneral(general);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteGeneralById(@PathVariable int id) {
        generalService.deleteGeneralById(id);
    }

    @PutMapping("/edit")
    public void editGeneralById(@RequestBody General general) {
        generalService.editGeneralById(general);
    }
}
