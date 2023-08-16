package com.dz.dz_web_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
