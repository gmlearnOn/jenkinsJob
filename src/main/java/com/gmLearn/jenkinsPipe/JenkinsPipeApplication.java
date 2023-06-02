package com.gmLearn.jenkinsPipe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsPipeApplication implements CommandLineRunner {

	
	public static final Logger log= LoggerFactory.getLogger(JenkinsPipeApplication.class);
	public static void main(String[] args) {
		
		log.info("Reach inside the main");
		SpringApplication.run(JenkinsPipeApplication.class, args);
	}
	
	@Override
	public void run(String... args)throws Exception {
		log.info("Reach inside the run");
	}

}
