package com.springbootvip.todoapp.controller;

import com.springbootvip.todoapp.dto.DTOToDoActivate;
import com.springbootvip.todoapp.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class ToDoController {

    private ToDoService toDoService;
    @Autowired
    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }
    @PostMapping("/addTodo")
    public ResponseEntity<DTOToDoActivate> addToDoActivate(@RequestBody  DTOToDoActivate dtoToDoActivate) {
        return new ResponseEntity<>(toDoService.addToDo(dtoToDoActivate), HttpStatus.CREATED);
    }
}
