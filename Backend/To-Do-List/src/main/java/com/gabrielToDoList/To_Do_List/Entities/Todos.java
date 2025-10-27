
package com.gabrielToDoList.To_Do_List.Entities;

public class Todos {

    private Long id;

    private String name;

    private String description;

    private Boolean completed;

    public Todos(){}

    public Todos( Todos entity ){

        this.name = entity.name;

        this.description = entity.description;

        this.completed = entity.completed;

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
