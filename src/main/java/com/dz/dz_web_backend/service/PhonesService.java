package com.dz.dz_web_backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dz.dz_web_backend.MODEL.Phones;
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

    public void setAllPhones(List<Phones> phones) {
        phonesDao.saveAll(phones);

    }

    public void deletePhonesById(int id) {
        phonesDao.deleteById(id);
    }

    public void editPhonesById(Phones phones) {
        phonesDao.save(phones);

    }

    public Optional<Phones> getPhonesByID(int id) {
        return phonesDao.findById(id);
    }
}
