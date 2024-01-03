package com.example.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@EntityScan
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserMdl {
    private String username;
    private String password;
    private String name;
    private String address;
    private String mail;
}
