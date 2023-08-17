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

    @GetMapping("/getbyid/{id}")
    public Optional<Testimonial> getTestimonialByID(@PathVariable int id) {
        return testimonialService.getTestimonialByID(id);
    }

    @PostMapping("/set")
    public void setAllTestimonial(@RequestBody List<Testimonial> testimonial) {
        testimonialService.setAllTestimonial(testimonial);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTestimonialById(@PathVariable int id) {
        testimonialService.deleteTestimonialById(id);
    }

    @PutMapping("/edit")
    public void editTestimonialById(@RequestBody Testimonial testimonial) {
        testimonialService.editTestimonialById(testimonial);
    }
}
