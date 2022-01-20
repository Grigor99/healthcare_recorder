package com.example.healthcare_recorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@EnableMongoAuditing
@EnableMongoRepositories(basePackages = "com.example.healthcare_recorder")
@SpringBootApplication
public class HealthcareRecorderApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthcareRecorderApplication.class, args);
	}

}
