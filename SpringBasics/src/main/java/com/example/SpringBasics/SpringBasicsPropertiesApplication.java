package com.example.SpringBasics;


import com.example.SpringBasics.basic.BinarySearchImpl;
import com.example.SpringBasics.properties.SomeExternalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:app.properties")
public class SpringBasicsPropertiesApplication {
    private static final Logger logger = LoggerFactory.getLogger(SpringBasicsPropertiesApplication.class);

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBasicsPropertiesApplication.class, args);
        applicationContext.registerShutdownHook();


        SomeExternalService externalService = applicationContext.getBean(SomeExternalService.class);
        logger.info("{}", externalService.getUrl());

        //Thread.sleep(10000);
    }

}

