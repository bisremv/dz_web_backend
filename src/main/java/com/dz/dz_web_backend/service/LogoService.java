package com.dz.dz_web_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dz.dz_web_backend.MODEL.Logo;
import com.dz.dz_web_backend.dao.LogoDao;

@Service
public class LogoService {
    private LogoDao logoDao;

    @Autowired
    public LogoService(LogoDao logoDao) {
        this.logoDao = logoDao;
    }

    public List<Logo> getAllLogo() {
        return (List<Logo>) logoDao.findAll();
    }
}
