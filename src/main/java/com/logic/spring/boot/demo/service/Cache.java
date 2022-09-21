package com.logic.spring.boot.demo.service;

public interface Cache {
    String set(String key,String value);
    String get(String key);
}
