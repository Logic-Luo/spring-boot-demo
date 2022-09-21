package com.logic.spring.boot.demo.service.impl;

import com.logic.spring.boot.demo.service.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class CacheImpl implements Cache {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Override
    public String set(String key, String value) {
        stringRedisTemplate.opsForValue().set(key, value);
        return "success";
    }

    @Override
    public String get(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }
}
