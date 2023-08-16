package com.dz.dz_web_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dz.dz_web_backend.MODEL.Testimonial;
import com.dz.dz_web_backend.dao.TestimonialDao;

@Service
public class TestimonialService {

    private TestimonialDao testimonialDao;

    @Autowired
    public TestimonialService(TestimonialDao testimonialDao) {
        this.testimonialDao = testimonialDao;
    }

    public List<Testimonial> getAlltestimonial() {
        return (List<Testimonial>) testimonialDao.findAll();
    }
}
