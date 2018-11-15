package com.xbsj.controller;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.xbsj.entity.SysUser;
import com.xbsj.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Resource(name = "userServiceImpl")
    private UserService userService;

    @RequestMapping("/first")
    public String Frist(Model map){

        List<SysUser> sysUsers = userService.selectUserAll();
        map.addAttribute("users",sysUsers);
        for (SysUser s:sysUsers
             ) {
            System.out.println(s.getUserEmail());
        }
        return "main";
    }
}
