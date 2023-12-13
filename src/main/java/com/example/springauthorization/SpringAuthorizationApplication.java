package com.example.springauthorization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringAuthorizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAuthorizationApplication.class, args);
	}

}
