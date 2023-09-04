package com.dz.dz_web_backend.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dz.dz_web_backend.MODEL.Admin;
import java.util.List;

@Repository
public interface AdminDao extends CrudRepository<Admin, Integer> {
    Optional<Admin> findByUsername(String username);
}
