package com.dz.dz_web_backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dz.dz_web_backend.MODEL.Footer;
import com.dz.dz_web_backend.dao.FooterDao;

@Service
public class FooterService {
    private FooterDao footerDao;

    @Autowired
    public FooterService(FooterDao footerDao) {
        this.footerDao = footerDao;
    }

    public List<Footer> getAllFooter() {
        return (List<Footer>) footerDao.findAll();
    }

    public void setAllFooter(List<Footer> footer) {
        footerDao.saveAll(footer);

    }

    public void deleteFooterById(int id) {
        footerDao.deleteById(id);
    }

    public void editFooterById(Footer footer) {
        footerDao.save(footer);

    }

    public Optional<Footer> getFooterByID(int id) {
        return footerDao.findById(id);
    }
}
