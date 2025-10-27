package com.gabrielToDoList.To_Do_List.Repositories;

import com.gabrielToDoList.To_Do_List.Entities.Todos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodosRepository extends JpaRepository< Long, Todos> {
}
