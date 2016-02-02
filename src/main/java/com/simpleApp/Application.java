package com.simpleApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@EnableAutoConfiguration
@SpringBootApplication
public class Application extends SpringBootServletInitializer {    //tomcat运行要继承SpringBootServletInitializer

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
