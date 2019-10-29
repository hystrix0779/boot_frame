package com.oracle.app;

import com.oracle.config.MybatisConfig;
import com.oracle.config.RedisConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({MybatisConfig.class, RedisConfig.class})
public class SsmSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsmSpringbootApplication.class, args);
    }

}
