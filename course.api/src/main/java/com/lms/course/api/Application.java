package com.lms.course.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Application {

	public Application() throws JsonProcessingException {
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


}