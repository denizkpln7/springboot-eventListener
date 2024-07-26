package com.denizkpln.applicationevent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class ApplicationeventApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationeventApplication.class, args);
	}

}
