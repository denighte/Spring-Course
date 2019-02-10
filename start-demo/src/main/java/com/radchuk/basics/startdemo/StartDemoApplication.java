package com.radchuk.basics.startdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StartDemoApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(StartDemoApplication.class);

	private final SortAlgorithm sortAlgorithm;

	@Autowired
	private ApplicationContext appContext;

	public StartDemoApplication(@Autowired SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(StartDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.debug("RUNNING THE APPLICATION");
		sortAlgorithm.sort(null);
	}
}

