package com.gabrielToDoList.To_Do_List.Services;

import com.gabrielToDoList.To_Do_List.DTOs.TodosDTO;
import com.gabrielToDoList.To_Do_List.Entities.Todos;
import com.gabrielToDoList.To_Do_List.Repositories.TodosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodosRepository repository;

    public List<TodosDTO> findAllTodos(){

        List<Todos> contentList = repository.findAll();

        List<TodosDTO> contentListDTO = new ArrayList<>();

        for( Todos itemList : contentList){ contentListDTO.add( new TodosDTO( itemList )); }

        return contentListDTO;
    }

    public void findOneTodo( Long id ){ }

    public void insertANewTodo( TodosDTO dto ){ }

    public void updateATodo( Long id, TodosDTO dto ){}

    public void deleteATodo( Long id ){}
}
