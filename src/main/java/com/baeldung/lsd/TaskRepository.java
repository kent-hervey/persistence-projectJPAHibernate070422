package com.baeldung.lsd;

import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository< Task, Long> {
}
