package com.atguigu.boot.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@ToString
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private String userName;
    private Boolean boos;
    private Date birth;
}
