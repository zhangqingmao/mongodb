package com.mwkj.mongodb.service;

import com.mwkj.mongodb.po.User;

import java.util.List;

/**
 * @author zhangqm
 * @version 1.0
 * @email zqmyouxiang@foxmail.com
 * @date 2020/8/24 14:30
 * @project mongodb
 */
public interface UserService {
    List<User> findAll();
}
