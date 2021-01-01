package com.atguigu.boot.bean;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
    private String name;
    private Integer age;
    private Pet pet;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
