package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.io.FileReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("springconfig");
        System.out.println("Through Application context");
        Movie movie=context.getBean("movie", Movie.class);
        System.out.println(movie);

        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("springconfig"));
        System.out.println("Through Bean factory");
        Movie movie1=(Movie)factory.getBean("movie");
        System.out.println(movie);




    }
}
