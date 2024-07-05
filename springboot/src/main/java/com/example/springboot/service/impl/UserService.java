package com.example.springboot.service.impl;

import com.example.springboot.controller.request.UserPageRequest;
import com.example.springboot.entity.User;
import com.example.springboot.mapper.UserMapper;
import com.example.springboot.service.IUserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 浏览器搜索 https://luodashuaishuai.github.io/
 *
 * @author LuoDashuai
 * @date 2024-04-22
 */
@Service
public class UserService implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> list() {
        return userMapper.list(); //可能出错，需要try catch提供异常处理
    }

    @Override
    public Object page(UserPageRequest userPageRequest) {
        String name = userPageRequest.getName();
        String phone = userPageRequest.getPhone();
        return null;
    }
}
