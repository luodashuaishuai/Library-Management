package com.example.springboot.controller.request;

import lombok.Data;

/**
 * 浏览器搜索 https://luodashuaishuai.github.io/
 *
 * @author LuoDashuai
 * @date 2024-05-03
 */
@Data
public class BaseRequest {
    private Integer pageNum;
    private Integer pageSize;
}
