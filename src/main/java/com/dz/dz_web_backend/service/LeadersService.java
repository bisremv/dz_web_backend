package com.dz.dz_web_backend.service;

import java.util.List;
import java.util.Optional;

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

    public void setAllLeaders(Leaders leaders) {
        leadersDao.save(leaders);

    }

    public void deleteLeadersById(int id) {
        leadersDao.deleteById(id);
    }

    public void editLeadersById(Leaders leaders) {
        leadersDao.save(leaders);

    }

    public Optional<Leaders> getLeadersByID(int id) {
        return leadersDao.findById(id);
    }
}
