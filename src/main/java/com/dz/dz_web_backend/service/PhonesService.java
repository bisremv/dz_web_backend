package com.dz.dz_web_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dz.dz_web_backend.MODEL.Phones;
import com.dz.dz_web_backend.dao.PhonesDao;

@Service
public class PhonesService {
    private PhonesDao phonesDao;

    @Autowired
    public PhonesService(PhonesDao phonesDao) {
        this.phonesDao = phonesDao;
    }

    public List<Phones> getAllPhones() {
        return (List<Phones>) phonesDao.findAll();
    }
}
