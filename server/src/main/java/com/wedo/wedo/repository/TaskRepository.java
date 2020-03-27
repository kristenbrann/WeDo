package com.wedo.wedo.repository;

import com.wedo.wedo.dto.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TaskRepository extends JpaRepository<Task, UUID> {

}
