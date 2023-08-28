package com.dz.dz_web_backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dz.dz_web_backend.MODEL.Card;
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

    public void setCard(Card card) {
        cardDao.save(card);

    }

    public void deleteCardById(int id) {
        cardDao.deleteById(id);
    }

    public void editCardById(Card card) {
        cardDao.save(card);

    }

    public Optional<Card> getCardByID(int id) {
        return cardDao.findById(id);
    }
}
