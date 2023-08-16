package com.dz.dz_web_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dz.dz_web_backend.MODEL.CompanyInfo;
import com.dz.dz_web_backend.service.CompanyInfoService;

@RestController
@RequestMapping("/CompanyInfo")
public class CompanyInfoController {
    private CompanyInfoService companyInfoService;

    @Autowired
    public CompanyInfoController(CompanyInfoService companyInfoService) {
        this.companyInfoService = companyInfoService;
    }

    @GetMapping("/getall")
    public List<CompanyInfo> getAllCompanyInfo() {
        return companyInfoService.getAllCompanyInfo();
    }
}
