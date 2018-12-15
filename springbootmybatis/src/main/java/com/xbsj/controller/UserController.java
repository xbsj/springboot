package com.xbsj.controller;

import com.xbsj.entity.SysUser;
import com.xbsj.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {

    @Resource(name = "userServiceimpl")
    private UserService userService;

    @RequestMapping("/userAll")
    public @ResponseBody Object userAll(){
        List<SysUser> sysUsers = userService.selectUserAll();
        return sysUsers;
    }
}
