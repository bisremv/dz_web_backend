package com.dz.dz_web_backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dz.dz_web_backend.MODEL.ContactMessage;
// import com.dz.dz_web_backend.dao.ContactDao;
import com.dz.dz_web_backend.dao.ContactDao;

@Service
public class ContactService {
    private ContactDao contactDao;

    @Autowired
    public ContactService(ContactDao contactDao) {
        this.contactDao = contactDao;
    }

    public List<ContactMessage> getAllContact() {
        return (List<ContactMessage>) contactDao.findAll();
    }

    public void setAllContact(List<ContactMessage> contact) {
        contactDao.saveAll(contact);

    }

    public void setContact(ContactMessage contact) {
        contactDao.save(contact);
    }

    public void deleteContactById(int id) {
        contactDao.deleteById(id);
    }

    public void editContactById(ContactMessage contact) {
        contactDao.save(contact);

    }

    public Optional<ContactMessage> getContactByID(int id) {
        return contactDao.findById(id);
    }

}
