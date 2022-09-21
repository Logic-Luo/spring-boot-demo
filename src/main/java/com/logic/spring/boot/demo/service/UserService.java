package com.logic.spring.boot.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.logic.spring.boot.demo.entity.User;

public interface UserService extends IService<User> {
    User selectByName(String userName);
}
