package com.aojie.chen.microserversimpleconsumermovie;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
/*
可添加httpbase的认证拦截器
 */
@Configuration
public class FooConfiguration {
    @Bean
    public BasicAuthorizationInterceptor basicAuthorizationInterceptor(){
        return new BasicAuthorizationInterceptor("user","pass");
    }
}
