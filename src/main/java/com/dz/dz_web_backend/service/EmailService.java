package com.dz.dz_web_backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dz.dz_web_backend.MODEL.Emails;
import com.dz.dz_web_backend.dao.EmailDao;

@Service
public class EmailService {
    private EmailDao emailDao;

    @Autowired
    public EmailService(EmailDao emailDao) {
        this.emailDao = emailDao;
    }

    public List<Emails> getAllEmail() {
        return (List<Emails>) emailDao.findAll();
    }

    public void setAllEmail(List<Emails> email) {
        emailDao.saveAll(email);

    }

    public void deleteEmailById(int id) {
        emailDao.deleteById(id);
    }

    public void editEmailById(Emails email) {
        emailDao.save(email);

    }

    public Optional<Emails> getEmailByID(int id) {
        return emailDao.findById(id);
    }
}
