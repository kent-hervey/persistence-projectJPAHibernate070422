package com.baeldung.lsd;

import org.springframework.data.repository.CrudRepository;

public interface WorkerRepository extends CrudRepository< Project, Long> {
}
