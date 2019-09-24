package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {

    private Actor actor1;

    public Movie(Actor actor1) {
        this.actor1 = actor1;
    }

    public Movie() {
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("beanfactory:"+beanFactory);

    }

    @Override
    public void setBeanName(String s) {
        System.out.println("beanname:"+ s);

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("applicationContext "+applicationContext);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor1=" + actor1 +
                '}';
    }
}
