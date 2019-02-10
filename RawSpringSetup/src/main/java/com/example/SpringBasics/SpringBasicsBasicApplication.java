package com.example.SpringBasics;

import com.example.SpringBasics.basic.BinarySearchImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.SpringBasics")
public class SpringBasicsBasicApplication {
	private static final Logger logger = LoggerFactory.getLogger(SpringBasicsBasicApplication.class);

	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBasicsBasicApplication.class);
		applicationContext.registerShutdownHook();


		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		logger.info(binarySearch.toString());
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		logger.info(binarySearch1.toString());
		System.out.println(binarySearch == binarySearch1);

		int result = binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
		System.out.println(result);
		applicationContext.close();
	}

}

