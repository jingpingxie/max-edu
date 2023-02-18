package com.matrix.eduservice.config;
/**
 * @author Jingping.Xie
 * @date 2023/1/19 15:22
 */

import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @projectName: max_kspring
 * @package: com.matrix.eduservice.config
 * @className: MyBatisPlusConfig
 * @author: jingpingxie
 * @description: TODO
 * @date: 2023/1/19 15:22
 * @version: 1.0
 */
@Configuration
@EnableTransactionManagement
@MapperScan("com.matrix.eduservice.mapper")

public class MyBatisPlusConfig {
    /**
     * 逻辑删除插件
     */
    @Bean
    public ISqlInjector sqlInjector() {
        return new LogicSqlInjector();
    }
    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
