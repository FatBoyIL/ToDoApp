package com.springbootvip.todoapp.service;

import com.springbootvip.todoapp.dto.DTOToDoActivate;
import com.springbootvip.todoapp.model.ToDoActivate;

public interface ToDoService {
    DTOToDoActivate addToDo(DTOToDoActivate act);
}
