package com.logic.spring.boot.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.logic.spring.boot.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
