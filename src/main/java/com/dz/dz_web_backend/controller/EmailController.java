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
import com.dz.dz_web_backend.MODEL.Emails;
import com.dz.dz_web_backend.service.EmailService;

@RestController
@RequestMapping("/email")
public class EmailController {
    private EmailService emailService;

    @Autowired
    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @GetMapping("/getall")
    public List<Emails> getAllEmail() {
        return (List<Emails>) emailService.getAllEmail();
    }

    @GetMapping("/getbyid/{id}")
    public Optional<Emails> getEmailByID(@PathVariable int id) {
        return emailService.getEmailByID(id);
    }

    @PostMapping("/set")
    public void setAllEmail(@RequestBody List<Emails> email) {
        emailService.setAllEmail(email);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmailById(@PathVariable int id) {
        emailService.deleteEmailById(id);
    }

    @PutMapping("/edit")
    public void editEmailById(@RequestBody Emails email) {
        emailService.editEmailById(email);
    }
}
