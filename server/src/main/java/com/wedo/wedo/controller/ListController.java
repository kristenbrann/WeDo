package com.wedo.wedo.controller;

import com.wedo.wedo.dto.TaskList;
import com.wedo.wedo.repository.TaskListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/lists")
public class ListController {

    @Autowired
    private final TaskListRepository repository;

    ListController(TaskListRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    List<TaskList> getLists() {
        return repository.findAll();
    }

    @PostMapping()
    TaskList newList(@RequestBody TaskList taskList) {
        return repository.save(taskList);
    }

    @GetMapping(value = "/{listId}")
    TaskList getList(@PathVariable String listId) {
        return repository.findById(listId).orElse(null);
    }
}
