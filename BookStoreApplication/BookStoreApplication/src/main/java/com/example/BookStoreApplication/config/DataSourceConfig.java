package com.example.BookStoreApplication.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DataSourceConfig {
    @Bean
    @Profile("dev")
    public String devDataSource(){
        return "Connected to dev DB" ;
    }
    @Bean
    @Profile("prod")
    public String stageDataSource(){
        return "Connected to STAGE DB" ;
    }

    @Bean
    @Profile("prod")
    public String prodDataSource(){
        return "Connected to PROD DB" ;
    }
}
