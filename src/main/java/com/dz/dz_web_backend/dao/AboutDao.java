package com.dz.dz_web_backend.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dz.dz_web_backend.MODEL.About;

@Repository
public interface AboutDao extends CrudRepository<About, Integer> {

}
