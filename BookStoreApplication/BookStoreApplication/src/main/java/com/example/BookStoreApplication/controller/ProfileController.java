package com.example.BookStoreApplication.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
    private final String dataSources ;

    public ProfileController(@Qualifier("devDataSource") String dataSource){
        this.dataSources = dataSource ;
    }

    @GetMapping("/profile")
    public String showActiveProfile(){
        return "Current Active Profile: "+dataSources;
    }
}
