package com.micro.schoolbuilder;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * 学校创建系统入口
 * 学校增删改查
 * 对应通知学生系统
 * 如果学校删除，则学生解散
 * 如果学校增加，则学生上学
 * 学生系统处理完毕之后
 * 通知学校系统，完成接收
 */
@SpringBootApplication
@MapperScan("com.micro.schoolbuilder.mapper")
public class SchoolBuilderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolBuilderApplication.class, args);
    }

}
