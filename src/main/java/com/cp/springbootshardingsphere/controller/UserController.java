package com.cp.springbootshardingsphere.controller;

import com.cp.springbootshardingsphere.entity.User;
import com.cp.springbootshardingsphere.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @description
 * @author: chenping
 * @create: 2019-12-03
 **/
@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/list")
    public List<User> list() {
        List<User> list = userMapper.selectAll();
        return list;
    }

    @PostMapping("/insert")
    public int insert() {
        User user = new User();
        user.setAge(11);
        user.setCreateTime(new Date());
        user.setName("jack");
        int result = userMapper.insert(user);
        return result;
    }
}
