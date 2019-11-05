package com.github.springbootcookie.controller;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 创建时间为 下午2:00 2019/9/24
 * 项目名称 spring-boot-cookie
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@RestController
public class CookieController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/2")
    public String index2(){
        return "index2";
    }

    @GetMapping("/cookie")
    public String getCookie(@CookieValue(value = "test") String test) {
        return "cookie:test:" + test;
    }

}
