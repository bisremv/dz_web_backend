package com.dz.dz_web_backend.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.dz.dz_web_backend.MODEL.YourModel;

public interface YourModelRepository extends CrudRepository<YourModel, Long> {
    Optional<YourModel> findByName(String fileName);

    void deleteByName(String name);
}
