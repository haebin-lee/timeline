package com.lucy.timeline;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan(basePackages = "com.lucy.timeline.mapper")
@ComponentScan(basePackages = "com.lucy.timeline")
@SpringBootApplication
public class TimelineApplication {
    public static void main(String[] args) {
        SpringApplication.run(TimelineApplication.class, args);
    }
}
