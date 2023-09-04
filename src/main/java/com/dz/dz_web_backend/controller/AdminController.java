package com.dz.dz_web_backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dz.dz_web_backend.MODEL.Admin;
import com.dz.dz_web_backend.MODEL.ContactMessage;
import com.dz.dz_web_backend.service.AdminService;

@RestController
@RequestMapping("/security")
public class AdminController {
    private AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/get")
    public boolean getContactByID(@RequestParam(name = "username") String username,
            @RequestParam(name = "password") String password) {
        return adminService.getByName(username, password);
    }

    @PutMapping("/edit")
    public void editById(@RequestBody Admin admin) {
        adminService.edit(admin);
    }

}
