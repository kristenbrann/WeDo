package com.wedo.wedo.repository;

import com.wedo.wedo.dto.TaskList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskListRepository extends JpaRepository<TaskList, String> {

}
