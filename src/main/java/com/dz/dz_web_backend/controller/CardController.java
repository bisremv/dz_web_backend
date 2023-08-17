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
        return cardService.getAllcardsBycategory(category);
    }

    @GetMapping("/getbyid/{id}")
    public Optional<Card> getCardByID(@PathVariable int id) {
        return CardService.getCardByID(id);
    }

    @PostMapping("/set")
    public void setAllCard(@RequestBody List<Card> card) {
        cardService.setAllCard(card);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCardById(@PathVariable int id) {
        cardService.deleteCardById(id);
    }

    @PutMapping("/edit")
    public void editCardById(@RequestBody Card card) {
        cardService.editCardById(card);
    }
}
