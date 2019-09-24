package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.SortedMap;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("bean Destroyed");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("dead");

    }

    public void customInit(){
        System.out.println("beanlifecycle init...");
    }

    public void customDestroy(){
        System.out.println("beanlifecycle destroyed...");
    }
}
