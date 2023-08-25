package com.dz.dz_web_backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dz.dz_web_backend.MODEL.General;
import com.dz.dz_web_backend.MODEL.General;
import com.dz.dz_web_backend.dao.GeneralDao;

@Service
public class GeneralService {
    private GeneralDao generalDao;

    @Autowired
    public GeneralService(GeneralDao generalDao) {
        this.generalDao = generalDao;
    }

    public List<General> getAllGeneral(String category) {
        return (List<General>) generalDao.findAllByCategory(category);
    }

    public void setAllGeneral(General general) {
        generalDao.save(general);

    }

    public void deleteGeneralById(int id) {
        generalDao.deleteById(id);
    }

    public void editGeneralById(General general) {
        generalDao.save(general);

    }

    public Optional<General> getGeneralByID(int id) {
        return generalDao.findById(id);
    }
}
