package com.baeldung.lsd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IntroToJpaRepositoriesApp implements ApplicationRunner {

    @Autowired
    private ProjectRepository projectRepository;

    private static final Logger LOG = LoggerFactory.getLogger(IntroToJpaRepositoriesApp.class);

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("inProjectRepository.run");
        Iterable<Project> allProjects = projectRepository.findAll();
        LOG.info("All Projects:\n{}", allProjects);
    }
}
