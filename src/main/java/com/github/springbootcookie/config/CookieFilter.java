package com.github.springbootcookie.config;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <p>
 * 创建时间为 上午12:03 2019/9/25
 * 项目名称 spring-boot-cookie
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */
//@Component
public class CookieFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, @NotNull FilterChain chain) throws IOException, ServletException {
        HttpServletResponse servletResponse = (HttpServletResponse) response;

        Cookie cookie1 = new Cookie("111111", "111111");
        Cookie cookie2 = new Cookie("222222", "222222");
        Cookie cookie3 = new Cookie("test", "q1111");
        // cookie1.setPath(((HttpServletRequest) request).getContextPath() + "/cookie1");
        // cookie2.setPath(((HttpServletRequest) request).getContextPath() + "/cookie2");
        servletResponse.addCookie(cookie1);
        servletResponse.addCookie(cookie2);
        servletResponse.addCookie(cookie3);

        chain.doFilter(request, response);
    }


}
