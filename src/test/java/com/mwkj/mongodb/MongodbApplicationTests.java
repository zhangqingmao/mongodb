package com.mwkj.mongodb;

import com.mwkj.mongodb.dao.UserDao;
import com.mwkj.mongodb.po.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class MongodbApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void contextLoads() {
    }

    @Test
    public void saveUser() {
        User user = new User(1, "张456", 16);
        userDao.save(user);
    }

}
