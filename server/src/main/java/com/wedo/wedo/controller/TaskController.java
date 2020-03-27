package com.wedo.wedo.controller;

import com.wedo.wedo.dto.Task;
import com.wedo.wedo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.UUID;

@RequestMapping("/v1/tasks")
@RestController
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping()
    List<Task> getTasks() {
        return taskRepository.findAll();
    }

    @PostMapping()
    Task newTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }

    @GetMapping(value = "/{taskId}")
    Task getTask(@PathVariable UUID taskId) {
        return taskRepository.getOne(taskId);
    }

    @PutMapping(value = "/{taskId}")
    Task updateTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }
}
