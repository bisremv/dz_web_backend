package com.dz.dz_web_backend.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dz.dz_web_backend.MODEL.General;
import java.util.List;

@Repository
public interface GeneralDao extends CrudRepository<General, Integer> {
    public List<General> findAllByCategory(String category);
}
