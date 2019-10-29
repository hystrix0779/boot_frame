package com.oracle.config;



import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Description:
 * @Author: niulixiong
 * @CreateDate: 2019/10/9 19:34
 * @Version: 1.0
 **/
@Configuration
@ComponentScan("com.oracle")
@MapperScan("com.oracle.ssm_springboot.mapper")
@EnableTransactionManagement
public class MybatisConfig {
}
