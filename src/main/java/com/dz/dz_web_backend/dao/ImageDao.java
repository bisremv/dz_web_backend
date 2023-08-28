package com.dz.dz_web_backend.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.dz.dz_web_backend.MODEL.Image;

public interface ImageDao extends CrudRepository<Image, Long> {
    Optional<Image> findByName(String fileName);

    void deleteByName(String name);
}
