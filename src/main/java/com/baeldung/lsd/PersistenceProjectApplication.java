package com.baeldung.lsd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PersistenceProjectApplication {

	public static void main(String[] args) {
		final ConfigurableApplicationContext run = SpringApplication.run(PersistenceProjectApplication.class, args);
	}

}
