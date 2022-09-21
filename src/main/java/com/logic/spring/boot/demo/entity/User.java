package com.logic.spring.boot.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode
@TableName("t_user")
@Builder
public class User {
    private Long ID;
    private String userName;
    private String password;
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;
}
