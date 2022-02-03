package com.mytest.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/mytest")
    public String hello() {
        return "hello";
    }

    @GetMapping("/myjson")
    public Map<String, String> myjson(@RequestParam("name") String name, @RequestParam("age") String age) {

        Map<String, String> map = new HashMap<String, String>();
        map.put("name", name);
        map.put("age", age);

        return map;
    }
}
