package com.atguigu.boot.controller;


import com.atguigu.boot.bean.Car;
import com.atguigu.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class HelloController {
    @Autowired
    Car car;

    @Autowired
    Person person;

    @RequestMapping("/car")
    public Car car(){
        return car;
    }

    @RequestMapping("/hello")
    public String hand001(){
        return "Hello World";
    }
    @RequestMapping("/person")
    public Person person(){
        return person;
    }

    @GetMapping("/user")
    public String getUser(){
        return "GET-ZHANGSAN";
    }
    @PostMapping("/user")
    public String saveUser(){
        return "Postzhang";
    }
    @PutMapping("/user")
    public String putUser(){
        return "putzhang";
    }
    @DeleteMapping("/user")
    public String deleteUser(){
        return "deletezhang";
    }
}
