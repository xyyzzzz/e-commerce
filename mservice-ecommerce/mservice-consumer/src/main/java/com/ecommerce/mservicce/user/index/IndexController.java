package com.ecommerce.mservicce.user.index;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {


    @RequestMapping("/index")
    public Object greeting(@RequestParam(value="name", defaultValue="World") String name) {

        Map map = new HashMap<>();
        map.put("name",name);
        map.put("content",String.format("Hi %s, lets begin.",name));
        return map;
    }
}