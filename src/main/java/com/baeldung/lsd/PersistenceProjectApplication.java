package com.baeldung.lsd;

import java.util.Optional;
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

	@Autowired
	private TaskRepository taskRepository;

	@Autowired
	private WorkerRepository workerRepository;

	private static final Logger LOG = LoggerFactory.getLogger(PersistenceProjectApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PersistenceProjectApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Missouri");
		Iterable<Project> allProjects = projectRepository.findAll();
		LOG.info("All Projects:\n{}", allProjects);

		Optional<Task> project1 = taskRepository.findById(1L);
			LOG.info("Task by id 1:\n{}", project1);

		System.out.println("Texas");
	}
}
