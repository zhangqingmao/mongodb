package com.mwkj.mongodb.web;

import com.mwkj.mongodb.po.User;
import com.mwkj.mongodb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhangqm
 * @version 1.0
 * @email zqmyouxiang@foxmail.com
 * @date 2020/8/24 14:29
 * @project mongodb
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("get")
    public List<User> getAll() {
        return this.userService.findAll();
    }

}
