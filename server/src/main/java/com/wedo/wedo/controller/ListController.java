package com.wedo.wedo.controller;

import com.wedo.wedo.dto.ListDto;
import com.wedo.wedo.dto.TaskDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListController {

    @PostMapping("/v1/lists")
    ListDto newList(@RequestBody ListDto listDto) {
        return listDto;
    }
}
