package com.springbootvip.todoapp.repository;

import com.springbootvip.todoapp.model.ToDoActivate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDoActivate, Long> {

}
