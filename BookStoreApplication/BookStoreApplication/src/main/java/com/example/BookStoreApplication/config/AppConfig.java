package com.example.BookStoreApplication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public String welcomeUser(){
        return "HELLO WELCOME TO BOOKSTORE ";
    }
}
