package com.bean_init_destroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.bean_init_destroy")
public class PrePostConfig {
    @Bean(initMethod = "init", destroyMethod = "destroy")
    BeanWayService beanWayService(){
        return  new BeanWayService();
    }
    @Bean
    JSR250WayService jsr250WayService(){
        return  new JSR250WayService();
    }
}
