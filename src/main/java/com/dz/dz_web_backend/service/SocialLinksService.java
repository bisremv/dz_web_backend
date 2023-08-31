package com.dz.dz_web_backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dz.dz_web_backend.MODEL.SocialLinks;
import com.dz.dz_web_backend.dao.SocialLinksDao;

@Service
public class SocialLinksService {
    private SocialLinksDao socialLinkDao;

    @Autowired
    public SocialLinksService(SocialLinksDao socialLinkDao) {
        this.socialLinkDao = socialLinkDao;
    }

    public List<SocialLinks> getAllSocialLinks() {
        return (List<SocialLinks>) socialLinkDao.findAll();
    }

    public void setAllSocialLinks(SocialLinks socialLink) {
        socialLinkDao.save(socialLink);

    }

    public void deleteSocialLinksById(int id) {
        socialLinkDao.deleteById(id);
    }

    public void editSocialLinksById(SocialLinks socialLinks) {
        socialLinkDao.save(socialLinks);

    }

    public Optional<SocialLinks> getSocialLinksByID(int id) {
        return socialLinkDao.findById(id);
    }
}
