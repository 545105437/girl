package com.demo.controller;

import com.demo.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wal
 * @date 2017/12/7
 */
@RestController
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping("hello")
    public String hello(){
        return "hello,this is a springboot demo!";
    }

    @RequestMapping("/word/{name}")
    public String word(@PathVariable String name){
        return "word-spring boot:"+name;
    }

    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String say(){
        return "say:"+girlProperties.getValue()+","+girlProperties.getNumber()
                +","+girlProperties.getBignumber()+","+girlProperties.getTest1()
                +","+girlProperties.getTest2();
    }
}
