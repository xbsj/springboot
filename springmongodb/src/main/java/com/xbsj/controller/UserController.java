package com.xbsj.controller;

import com.xbsj.entity.User;
import com.xbsj.service.UserService;
import org.apache.logging.log4j.spi.ObjectThreadContextMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("add")
    public void  save(){
        User user = new User();
        user.setName("张三");
        user.setAge(18);
        userService.save(user);
    }

    @RequestMapping("byName")
     public Object getUserByName(){
        return userService.getUserByName("张三");
     }

    @RequestMapping("update")
     public Object updateUser(){
         User user = new User();
         user.setId("5ca1c56e967ac6450881a57b");
         user.setName("王五");
         user.setAge(19);
         userService.updateUser(user);

         return "修改成功！";
     }

    @RequestMapping("delete")
    public Object deleteById(){
        userService.deleteById("5ca1c56e967ac6450881a57b");
        return "删除成功！";
    }
}
