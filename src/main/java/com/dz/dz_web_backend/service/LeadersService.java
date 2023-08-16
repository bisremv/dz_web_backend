package com.dz.dz_web_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dz.dz_web_backend.MODEL.Leaders;
import com.dz.dz_web_backend.dao.LeadersDao;

@Service
public class LeadersService {
    private LeadersDao leadersDao;

    @Autowired
    public LeadersService(LeadersDao leadersDao) {
        this.leadersDao = leadersDao;
    }

    public List<Leaders> getAllLeaders() {
        return (List<Leaders>) leadersDao.findAll();
    }
}
