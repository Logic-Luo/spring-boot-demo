package com.logic.spring.boot.demo.service.impl;


import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.logic.spring.boot.demo.entity.User;
import com.logic.spring.boot.demo.mapper.UserMapper;
import com.logic.spring.boot.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectByName(String userName) {
        return  userMapper.selectOne(Wrappers.<User>lambdaQuery().eq(User::getUserName, userName));
    }
}
