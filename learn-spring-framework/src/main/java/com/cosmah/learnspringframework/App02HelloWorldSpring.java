package com.cosmah.learnspringframework;

import org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App02HelloWorldSpring {
    public static void main(String[] args){
        //1:Launch a spring context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //2:configure the things we want spring framework to manage using @Configuration class
        //HelloWorldConfiguration -@Configuration
        //name -@Bean

        //Retrieve Beans managed by Spring, use context to get the object
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
    }
}
