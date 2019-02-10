package com.example.SpringBasics;

import com.example.SpringBasics.cdi.SomeCdiBuisness;
import com.example.SpringBasics.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBasicsCdiApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBasicsCdiApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBasicsCdiApplication.class, args);
		SomeCdiBuisness personDAO = applicationContext.getBean(SomeCdiBuisness.class);
		LOGGER.info("{}", personDAO);
	}

}

