package com.atguigu.boot.config;

import com.atguigu.boot.bean.Pet;
import com.atguigu.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public Pet tomcatPet(){
        return new Pet("tomcat");
    }
}
