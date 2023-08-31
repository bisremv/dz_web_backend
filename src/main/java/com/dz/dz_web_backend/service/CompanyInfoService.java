package com.dz.dz_web_backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.dz.dz_web_backend.MODEL.CompanyInfo;
import com.dz.dz_web_backend.MODEL.CompanyInfo;
import com.dz.dz_web_backend.dao.CompanyInfoDao;

@Service
public class CompanyInfoService {
    private CompanyInfoDao companyInfoDao;

    @Autowired
    public CompanyInfoService(CompanyInfoDao companyInfoDao) {
        this.companyInfoDao = companyInfoDao;
    }

    public List<CompanyInfo> getAllCompanyInfo() {
        return (List<CompanyInfo>) companyInfoDao.findAll();
    }

    public void setCompanyInfo(CompanyInfo companyInfo) {
        companyInfoDao.save(companyInfo);

    }

    public void deleteCompanyInfoById(int id) {
        companyInfoDao.deleteById(id);
    }

    public void editCompanyInfoById(CompanyInfo companyInfo) {
        companyInfoDao.save(companyInfo);

    }

    public Optional<CompanyInfo> getCompanyInfoByID(int id) {
        return companyInfoDao.findById(id);
    }
}
