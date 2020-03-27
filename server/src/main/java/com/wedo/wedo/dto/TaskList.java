package com.wedo.wedo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class TaskList {

    @JsonProperty("list_id")
    @Id
    private String listId;

    @JsonProperty("list_name")
    private String listName;

    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskList taskList = (TaskList) o;
        return Objects.equals(listId, taskList.listId) &&
                Objects.equals(listName, taskList.listName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listId, listName);
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "listId='" + listId + '\'' +
                ", listName='" + listName + '\'' +
                '}';
    }
}
