package com.dz.dz_web_backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dz.dz_web_backend.MODEL.CompanyInfo;
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

    @GetMapping("/getbyid/{id}")
    public Optional<CompanyInfo> getCompanyInfoByID(@PathVariable int id) {
        return companyInfoService.getCompanyInfoByID(id);
    }

    @PostMapping("/set")
    public void setCompanyInfo(@RequestBody CompanyInfo companyInfo) {
        companyInfoService.setCompanyInfo(companyInfo);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCompanyInfoById(@PathVariable int id) {
        companyInfoService.deleteCompanyInfoById(id);
    }

    @PutMapping("/edit")
    public void editCompanyInfoById(@RequestBody CompanyInfo companyInfo) {
        companyInfoService.editCompanyInfoById(companyInfo);
    }

}
