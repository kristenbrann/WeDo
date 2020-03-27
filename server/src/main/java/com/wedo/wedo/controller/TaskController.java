package com.wedo.wedo.controller;

import com.wedo.wedo.dto.TaskDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @PostMapping("/v1/tasks")
    TaskDto newEmployee(@RequestBody TaskDto taskDto) {
        return taskDto;
    }
}
