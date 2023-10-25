package com.cosmah.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Eliminate verbosity in creating java beans
//public accessor methods, construtors,equals, hashcode and toString are automatically created.



//managing custom class
record Person(String name, int age){

}

@Configuration
public class HelloWorldConfiguration {
    //here we define spring beans

    @Bean
    public String name(){
        return "Range";
    }

    @Bean
    public int age(){
        return 20;
    }

//    @Bean
//    public String person(){
//        return "Jelly";
//    }

    @Bean
    public String person2(){
        return "Jamaica";
    }

    @Bean String address(){
        return "Market Street";
    }

    @Bean
    public Person person(){
        var person = new Person("Ravi" ,30);

        return person;
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(),age());
    }
}
