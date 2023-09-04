package com.dz.dz_web_backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dz.dz_web_backend.MODEL.Admin;
import com.dz.dz_web_backend.MODEL.CompanyInfo;
import com.dz.dz_web_backend.dao.AdminDao;
import com.dz.dz_web_backend.dao.CompanyInfoDao;

@Service
public class AdminService {

    private AdminDao adminDao;

    @Autowired
    public AdminService(AdminDao adminDao) {
        this.adminDao = adminDao;
    }

    public boolean getByName(String username, String password) {
        Optional<Admin> admin = adminDao.findByUsername(username.trim());
        if (admin.isPresent()) {
            String storedPassword = admin.get().getPassword();
            boolean passwordMatch = password.equalsIgnoreCase(storedPassword);
            return passwordMatch;
        } else {
            return false;
        }

    }

    public void edit(Admin admin) {
        admin.setId(1);
        adminDao.save(admin);
    }
}
