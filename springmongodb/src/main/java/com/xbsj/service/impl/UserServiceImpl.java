package com.xbsj.service.impl;

import com.xbsj.dao.UserDao;
import com.xbsj.entity.User;
import com.xbsj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserByName(String name) {
        return userDao.getUserByName(name);
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public void deleteById(String id) {
        userDao.deleteById(id);
    }
}
