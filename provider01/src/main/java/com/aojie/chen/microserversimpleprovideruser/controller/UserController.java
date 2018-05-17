package com.aojie.chen.microserversimpleprovideruser.controller;

import com.aojie.chen.microserversimpleprovideruser.entity.User;
import com.aojie.chen.microserversimpleprovideruser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/{id}")
    public User findone(@PathVariable Long id){
        User user = this.userRepository.getOne(id);
        return user;
    }
}
