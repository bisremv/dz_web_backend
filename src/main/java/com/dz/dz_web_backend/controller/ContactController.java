package com.dz.dz_web_backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dz.dz_web_backend.MODEL.ContactMessage;
import com.dz.dz_web_backend.service.ContactService;

@RestController
@RequestMapping("/contact")
@CrossOrigin
public class ContactController {

    private ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/getall")
    public List<ContactMessage> getAllContact() {
        return contactService.getAllContact();
    }

    @GetMapping("/getbyid/{id}")
    public Optional<ContactMessage> getContactByID(@PathVariable int id) {
        return contactService.getContactByID(id);
    }

    @PostMapping("/setall")
    public void setAllContact(@RequestBody List<ContactMessage> contact) {
        contactService.setAllContact(contact);
    }

    @PostMapping("/set")
    public void setContact(@RequestBody ContactMessage contact) {
        contactService.setContact(contact);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteContactById(@PathVariable int id) {
        contactService.deleteContactById(id);
    }

    @PutMapping("/edit")
    public void editContactById(@RequestBody ContactMessage contact) {
        contactService.editContactById(contact);
    }

}
