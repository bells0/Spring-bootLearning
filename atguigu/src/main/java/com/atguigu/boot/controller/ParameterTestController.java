package com.atguigu.boot.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ParameterTestController {

    @GetMapping("/car/{id}/owner/{username}")
    public Map<String,Object> getCar(@PathVariable("id") Integer id2,
                                     @PathVariable("username") String name2,
                                     @PathVariable Map<String,String> pv,
                                     @RequestHeader("User-Agent") String userAgent,
                                     @RequestHeader Map<String,String> header,
                                     @RequestParam("age") Integer age,
                                     @RequestParam("inters")List<String> inters){
        HashMap<String, Object> map = new HashMap<>();
        map.put("我是你的ID",id2);
        map.put("哈哈name",name2);
        map.put("我是你的PVpv",pv);
        map.put("获取到的User Agent",userAgent);
        map.put("这个是获取到的Headers",header);
        return map;

    }
}
