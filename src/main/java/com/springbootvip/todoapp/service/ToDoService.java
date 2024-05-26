package com.springbootvip.todoapp.service;

import com.springbootvip.todoapp.dto.DTOToDoActivate;

import java.util.List;

public interface ToDoService {
    DTOToDoActivate addToDo(DTOToDoActivate act);
    DTOToDoActivate updateToDo(DTOToDoActivate act,long id);
    List<DTOToDoActivate> deleteToDo(long id);
    List<DTOToDoActivate> getAllToDo();
    DTOToDoActivate getToDoById(long id);
}
