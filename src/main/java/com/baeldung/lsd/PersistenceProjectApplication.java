package com.baeldung.lsd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersistenceProjectApplication implements ApplicationRunner {

	@Autowired
	private ProjectRepository projectRepository;

	private static final Logger LOG = LoggerFactory.getLogger(PersistenceProjectApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PersistenceProjectApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Missouri");
		Iterable<Project> allProjects = projectRepository.findAll();
		LOG.info("All Projects:\n{}", allProjects);
		System.out.println("Texas");
	}
}
