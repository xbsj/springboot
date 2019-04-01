package com.xbsj.dao.impl;

import com.mongodb.client.model.Filters;
import com.mongodb.client.result.DeleteResult;
import com.xbsj.dao.UserDao;
import com.xbsj.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDao {
    @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    public User getUserByName(String name) {
        Query query = new Query(Criteria.where("name").is(name));
        return  mongoTemplate.findOne(query, User.class);
    }

    @Override
    public void save(User user){
        mongoTemplate.save(user);
    }

    @Override
    public void updateUser(User user) {
        Query query = new Query(Criteria.where("id").is(user.getId()));
        Update update = new Update().set("age",user.getAge()).set("name",user.getName());
        mongoTemplate.updateFirst(query,update,User.class);
    }

    @Override
    public void deleteById(String id) {
        Query query = new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query, User.class);
    }
}
