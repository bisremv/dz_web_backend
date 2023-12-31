package com.dz.dz_web_backend.service;

import java.util.List;
import java.util.Optional;

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

    public void setTestimonial(Testimonial testimonial) {
        testimonialDao.save(testimonial);

    }

    public void deleteTestimonialById(int id) {
        testimonialDao.deleteById(id);
    }

    public void editTestimonialById(Testimonial testimonial) {
        testimonialDao.save(testimonial);

    }

    public Optional<Testimonial> getTestimonialByID(int id) {
        return testimonialDao.findById(id);
    }
}
