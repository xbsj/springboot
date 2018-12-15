package com.xbsj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *  @RestController 相当于@Controller和 @ResponseBody
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public  String hello(){
        System.out.println("HelloController.hello");
        return "Hello Spring Boot";
    }

}
