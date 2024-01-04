package com.example.processor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.dao.OperatorLoginDAO;
import com.example.entity.UserMdl;

@Service
public class AuthenticateService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private OperatorLoginDAO operatorLoginDAO;

    public boolean authenticate(UserMdl user) {
        UserMdl userMdl = operatorLoginDAO.findByUsername(user.getUsername());

        return passwordEncoder.matches(user.getPassword(), userMdl.getPassword());
    }
}
