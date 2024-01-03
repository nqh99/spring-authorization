package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.UserMdl;

@Repository
public interface OperatorLoginDAO extends JpaRepository<UserMdl, Long> {
    public UserMdl findByUsername(String username);
}
