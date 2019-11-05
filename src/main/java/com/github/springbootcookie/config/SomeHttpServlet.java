package com.github.springbootcookie.config;

import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <p>
 * 创建时间为 下午11:45 2019/9/24
 * 项目名称 spring-boot-cookie
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */
//@Component
public class SomeHttpServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie1 = new Cookie("111111", "111111");
        cookie1.setPath("cookie1");
        Cookie cookie2 = new Cookie("222222", "222222");
        cookie2.setPath("cookie2");
        resp.addCookie(cookie1);
        resp.addCookie(cookie2);
//        super.doGet(req, resp);
    }
}
