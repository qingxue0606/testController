 package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
 public class HelloController {
    @RequestMapping("/save")
    public List<String> save(){
        List<String> list=new ArrayList<>();
        list.add("1");
        return list;
    }
}
