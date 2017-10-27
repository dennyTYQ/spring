package com.bean_init_destroy;

public class BeanWayService {
    public void init(){
        System.out.println("@Bean-init-method");
    }

    public BeanWayService() {
        super();
        System.out.println("初始化构造函数-BeanWayService");

    }
    public void destroy(){
        System.out.println("@bean -deatroy-method");
    }
}
