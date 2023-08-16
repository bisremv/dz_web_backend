package com.dz.dz_web_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dz.dz_web_backend.MODEL.Card;
import com.dz.dz_web_backend.dao.CardDao;

@Service
public class CardService {
    private CardDao cardDao;

    @Autowired
    public CardService(CardDao cardDao) {
        this.cardDao = cardDao;
    }

    public List<Card> getAllcardsBycategory(String category) {
        return (List<Card>) cardDao.findByCategory(category);
    }
}