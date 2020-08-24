package com.mwkj.mongodb.service.impl;

import com.mwkj.mongodb.dao.UserDao;
import com.mwkj.mongodb.po.User;
import com.mwkj.mongodb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangqm
 * @version 1.0
 * @email zqmyouxiang@foxmail.com
 * @date 2020/8/24 14:30
 * @project mongodb
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> findAll() {
        return this.userDao.findAll();
    }
}
