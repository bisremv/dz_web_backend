package com.dz.dz_web_backend.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dz.dz_web_backend.MODEL.Card;
import com.dz.dz_web_backend.service.CardService;

@RestController
@RequestMapping("/card")
public class CardController {
    private CardService cardService;

    @Autowired
    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping("/getall/{category}")
    public List<Card> getAllcardsBycategory(@PathVariable String category) {
        String decodedPathVariable;
        try {
            decodedPathVariable = java.net.URLDecoder.decode(category, "UTF-8");
            return cardService.getAllcardsBycategory(decodedPathVariable);
        } catch (UnsupportedEncodingException e) {
            return cardService.getAllcardsBycategory(category);
        }
    }
}
