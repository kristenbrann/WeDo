package com.wedo.wedo.controller;

import com.wedo.wedo.dto.ListDto;
import com.wedo.wedo.repository.ListRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListController {

    private final ListRepository repository;

    ListController(ListRepository repository) {
        this.repository = repository;
    }


    @PostMapping("/v1/lists")
    ListDto newList(@RequestBody ListDto listDto) {
        return repository.save(listDto);
    }
}
