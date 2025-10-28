
package com.gabrielToDoList.To_Do_List.Entities;

import jakarta.persistence.*;

@Entity
@Table( name = "tb_todos" )
public class Todos {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
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
