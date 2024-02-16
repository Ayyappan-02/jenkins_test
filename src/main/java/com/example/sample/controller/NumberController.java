package com.example.sample.controller;


import com.example.sample.model.number;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class NumberController {

    @PostMapping("/add")
    public Long addNum(@RequestBody number num){
        long l = num.getNum1() + num.getNum2();
        return l;
    }
}
