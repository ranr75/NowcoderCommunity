package com.nowcoder.community.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AlphaController {

    @RequestMapping("/login")
    public Map<String,String> Login(){
        Map<String,String> map = new HashMap<>();
        map.put("name","ran");
        return  map;}
}



