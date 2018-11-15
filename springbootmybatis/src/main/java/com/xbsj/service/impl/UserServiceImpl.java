package com.xbsj.service.impl;

import com.xbsj.entity.SysUser;
import com.xbsj.mapper.UserMapper;
import com.xbsj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userServiceimpl")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<SysUser> selectUserAll() {
        return userMapper.selectUserAll();
    }
}
