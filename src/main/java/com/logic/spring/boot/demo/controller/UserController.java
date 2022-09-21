package com.logic.spring.boot.demo.controller;

import com.logic.spring.boot.demo.entity.User;
import com.logic.spring.boot.demo.service.Cache;
import com.logic.spring.boot.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private Cache cache;

    @GetMapping("queryByUserName")
    public User queryByUserName(@RequestParam("userName") String userName) {
        return userService.selectByName(userName);
    }

    @GetMapping("/set")
    public String setKeyValue(@RequestParam("key") String key, @RequestParam("value") String value) {
        return cache.set(key, value);
    }

    @GetMapping("/get")
    public String getKey(@RequestParam("key") String key) {
        return cache.get(key);
    }
}
