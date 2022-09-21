CREATE TABLE t_user
(
    id bigint(20) NOT NULL AUTO_INCREMENT primary key COMMENT '主键',
    user_name VARCHAR(30) NOT NULL DEFAULT '' COMMENT '用户名',
    password VARCHAR(30)  NOT NULL DEFAULT '' COMMENT '密码',
    created_time datetime NOT NULL DEFAULT '0001-01-01 00:00:00' COMMENT '任务创建时间',
    updated_time datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间'
);