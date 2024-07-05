package com.example.springboot.mapper;

import com.example.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 浏览器搜索 https://luodashuaishuai.github.io/
 *
 * @author LuoDashuai
 * @date 2024-04-22
 */

@Mapper
public interface UserMapper {

//    @Select("select * from user")
    List<User> list();
}
