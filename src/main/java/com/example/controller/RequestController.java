package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.UserMdl;
import com.example.processor.AuthenticateService;


@RestController
@RequestMapping("/login")
public class RequestController {

    @Autowired
    private AuthenticateService authenticateService;

    @PostMapping("/auth")
    public ResponseEntity<?> responseAuthRequest(@RequestBody UserMdl loginRequest) {
        return authenticateService.authenticate(loginRequest) ? ResponseEntity.ok().build() : ResponseEntity.badRequest().build();
    }
}
