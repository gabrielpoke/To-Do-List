package com.gabrielToDoList.To_Do_List.Services;

import com.gabrielToDoList.To_Do_List.Repositories.TodosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private TodosRepository repository;

}
