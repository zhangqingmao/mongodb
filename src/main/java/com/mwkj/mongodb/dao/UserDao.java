package com.mwkj.mongodb.dao;

import com.mwkj.mongodb.po.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author zhangqm
 * @version 1.0
 * @email zqmyouxiang@foxmail.com
 * @date 2020/8/24 14:27
 * @project mongodb
 */
public interface UserDao extends MongoRepository<User,Integer> {
}
