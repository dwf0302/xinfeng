package com.noah.xinfeng.jwt.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description
 * @Author Dwf
 * @Date 2020/11/25 18:23
 * @Version 1.0
 **/
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authenticationInterceptor())
                // 拦截所有请求，通过判断是否有 @LoginRequired 注解 决定是否需要登录
                .addPathPatterns("/**");
    }

    @Bean
    public AuthenticationInterceptor authenticationInterceptor() {
        return new AuthenticationInterceptor();
    }
}
