package com.github.springbootcookie.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.config.annotation.web.http.SpringHttpSessionConfiguration;
import org.springframework.session.web.http.CookieHttpSessionIdResolver;
import org.springframework.session.web.http.CookieSerializer;
import org.springframework.session.web.http.DefaultCookieSerializer;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * <p>
 * 创建时间为 下午4:52 2019/10/15
 * 项目名称 spring-boot-cookie
 * </p>
 *
 * @author 石少东
 * @version 0.0.1
 * @since 0.0.1
 */

@Configuration
public class ConfigSessionConfig {

//    @Bean
    public CookieSerializer cookieSerializer() {
//        DefaultCookieSerializer defaultCookieSerializer = new DefaultCookieSerializer();
//        //cookie名字
//        defaultCookieSerializer.setCookieName("sessionId");
//        //域
//        defaultCookieSerializer.setDomainName("xxx.com");
//        //存储路径
//        defaultCookieSerializer.setCookiePath("/");
//        return defaultCookieSerializer;
        DefaultCookieSerializer cookieSerializer = new DefaultCookieSerializer();
        cookieSerializer.setUseHttpOnlyCookie(true);
        cookieSerializer.setSameSite(null);
        return cookieSerializer;

    }

    @Resource
    private SpringHttpSessionConfiguration configuration;

    @PostConstruct
    public void init() {
        configuration.setCookieSerializer(cookieSerializer());
    }

}
