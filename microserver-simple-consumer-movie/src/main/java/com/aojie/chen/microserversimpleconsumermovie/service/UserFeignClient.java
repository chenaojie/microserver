package com.aojie.chen.microserversimpleconsumermovie.service;

import com.aojie.chen.microserversimpleconsumermovie.FeignConfiguration;
import com.aojie.chen.microserversimpleconsumermovie.pojo.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "microserver-simple-provider-user",configuration = FeignConfiguration.class)
public interface UserFeignClient {
//    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
//    public User findById(@PathVariable("id") Long id);
    @RequestLine("GET /{id}")
    public User findById(@Param("id") Long id);
}
