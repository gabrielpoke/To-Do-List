package com.gabrielToDoList.To_Do_List.DTOs;

import com.gabrielToDoList.To_Do_List.Entities.Todos;

public class TodosDTO {

    private Long id;

    private String name;

    private String description;

    private Boolean completed;

    public TodosDTO(){}

    public TodosDTO( Todos entity ){

        this.name = entity.getName();

        this.description = entity.getDescription();

        this.completed = entity.getCompleted();

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getCompleted() {
        return completed;
    }
}
