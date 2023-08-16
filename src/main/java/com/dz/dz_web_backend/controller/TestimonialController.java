package com.dz.dz_web_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dz.dz_web_backend.MODEL.Testimonial;
import com.dz.dz_web_backend.service.TestimonialService;

@RestController
@RequestMapping("/testimonial")
public class TestimonialController {
    private TestimonialService testimonialService;

    @Autowired
    public TestimonialController(TestimonialService testimonialService) {
        this.testimonialService = testimonialService;
    }

    @GetMapping("/getall")
    public List<Testimonial> getAlltestimonial() {
        return testimonialService.getAlltestimonial();
    }
}
