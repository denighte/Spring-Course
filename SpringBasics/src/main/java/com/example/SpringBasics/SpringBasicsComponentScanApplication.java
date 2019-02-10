package com.example.SpringBasics;

import com.example.SpringBasics.scope.PersonDAO;
import com.example.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.example.componentscan")
public class SpringBasicsComponentScanApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBasicsComponentScanApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBasicsComponentScanApplication.class, args);
		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
		LOGGER.info("{}", componentDAO);
	}

}

