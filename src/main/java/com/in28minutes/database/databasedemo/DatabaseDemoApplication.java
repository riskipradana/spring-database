package com.in28minutes.database.databasedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * In memory database (like h2) is live as long as the application is running
 */

@SpringBootApplication
public class DatabaseDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}
}
