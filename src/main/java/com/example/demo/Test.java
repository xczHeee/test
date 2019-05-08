package com.example.demo;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @Autowired
    private Boy boy;

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String say(){
        System.out.println("111");
        return boy.getName()+","+boy.getSex()+","+boy.getAge();
    }
}
