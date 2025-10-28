package com.gabrielToDoList.To_Do_List.Resources;

import com.gabrielToDoList.To_Do_List.DTOs.TodosDTO;
import com.gabrielToDoList.To_Do_List.Services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController(value = "/todos")
public class TodosResource {

    @Autowired
    private TodoService service;

    @GetMapping
    public ResponseEntity<List<TodosDTO>> findAllTodos(){ return ResponseEntity.ok(service.findAllTodos()); }

    @GetMapping( value =  "/{id}")
    public void findOneTodo( @PathVariable Long id ){}

    @PostMapping
    public void insertNewTodo(@RequestBody TodosDTO information ){ }

    @PutMapping( value = "/{id}")
    public void updateATodo( @PathVariable Long id, @RequestBody TodosDTO information ){}

    @DeleteMapping( value = "/{id}")
    public void deleteOneTodo( @PathVariable Long id ){}

}
