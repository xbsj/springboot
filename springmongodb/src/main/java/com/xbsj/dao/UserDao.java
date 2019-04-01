package com.xbsj.dao;

import com.xbsj.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;


public interface UserDao{

    User getUserByName(String name);

    void save(User user);

    void updateUser(User user);

    void deleteById(String id);
}
