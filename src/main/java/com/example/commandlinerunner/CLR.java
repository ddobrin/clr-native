package com.example.commandlinerunner;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
public class CLR implements CommandLineRunner {

	private static final Log logger = LogFactory.getLog(SpringApplication.class);

	@Override
	public void run(String... args) throws Exception {
		System.out.println("--------------------------");
		System.out.println("commandlinerunner running!");
		System.out.println("--------------------------");
		logger.info("INFO Java 8 - Spring Native 0.8.5 image");
		logger.info("INFO Test date - " + LocalDateTime.now());
		logger.info("LOG test messages...-------------");
		logger.trace("WARNING log message");
		logger.debug("DEBUG log message");
		logger.info("INFO log message");
		logger.warn("WARNING log message");
		logger.error("ERROR log message");
		logger.info("End LOG test messages...---------");
		System.out.println("--------------------------");
	}
	
}
