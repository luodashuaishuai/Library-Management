package com.example.springboot.entity;
import lombok.Data;

/**
 * 浏览器搜索 https://luodashuaishuai.github.io/
 *
 * @author LuoDashuai
 * @date 2024-04-22
 */

@Data //替换模板代码get set
public class User {
    private int id;
    private String name;
    private Integer age;
    private String sex;
    private String phone;
    private String address;
}
