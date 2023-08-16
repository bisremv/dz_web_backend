package com.dz.dz_web_backend.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dz.dz_web_backend.MODEL.Card;

@Repository
public interface CardDao extends CrudRepository<Card, Integer> {
    List<Card> findByCategory(String category);
}
