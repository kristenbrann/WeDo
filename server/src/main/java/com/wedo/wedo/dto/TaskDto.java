package com.wedo.wedo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import java.util.Objects;

public class TaskDto {

    @JsonProperty("task_description")
    private String taskDescription;

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskDto taskDto = (TaskDto) o;
        return Objects.equals(taskDescription, taskDto.taskDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskDescription);
    }

    @Override
    public String toString() {
        return "TaskDto{" +
                "taskDescription='" + taskDescription + '\'' +
                '}';
    }
}
