package com.xbsj.service;

import com.xbsj.entity.User;

public interface UserService {

    User getUserByName(String name);

    void save(User user);

    public void updateUser(User user);

    public void deleteById(String id);
}
