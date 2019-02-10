package com.example.SpringBasics;

import com.example.SpringBasics.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@Configuration
//@ComponentScan
public class SpringBasicsXmlApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBasicsXmlApplication.class);

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		LOGGER.info("Beans loaded: {}", (Object)applicationContext.getBeanDefinitionNames());
		XmlPersonDAO personDAO = applicationContext.getBean(XmlPersonDAO.class);
		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getXmlJdbcConnection());
	}

}

