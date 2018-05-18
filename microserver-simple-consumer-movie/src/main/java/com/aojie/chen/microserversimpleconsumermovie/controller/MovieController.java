package com.aojie.chen.microserversimpleconsumermovie.controller;

import com.aojie.chen.microserversimpleconsumermovie.pojo.User;
import com.aojie.chen.microserversimpleconsumermovie.service.UserFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {
    private static final Logger LOGGER = LoggerFactory.getLogger(MovieController.class);
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){
        return this.restTemplate.getForObject("http://microserver-simple-provider-user/"+id,User.class);
    }

    @GetMapping("/user2/{id}")
    public User findById2(@PathVariable Long id){
        return this.userFeignClient.findById(id);
    }

    @GetMapping("/log-instance")
    public void logUserInstance(){
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("microserver-simple-provider-user");
        MovieController.LOGGER.info("{}:{}:{}",serviceInstance.getServiceId(),serviceInstance.getHost(),serviceInstance.getPort());
    }
}
