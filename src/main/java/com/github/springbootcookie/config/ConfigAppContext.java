package com.github.springbootcookie.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.web.http.CookieSerializer;
import org.springframework.session.web.http.HttpSessionIdResolver;

import javax.annotation.Resource;
import java.util.Map;

/**
 * <p>
 * 创建时间为 下午5:21 2019/10/15
 * 项目名称 spring-boot-cookie
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@Configuration
public class ConfigAppContext implements CommandLineRunner {

    @Resource
    private ApplicationContext context;

    @Override
    public void run(String... args) throws Exception {
        CookieSerializer cookieSerializer = context.getBean(CookieSerializer.class);
        Map<String, CookieSerializer> map = context.getBeansOfType(CookieSerializer.class);
        Map<String, HttpSessionIdResolver> map1 = context.getBeansOfType(HttpSessionIdResolver.class);
        System.out.println();
    }


}
