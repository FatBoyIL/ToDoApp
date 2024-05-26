package com.springbootvip.todoapp.controller;

import com.springbootvip.todoapp.dto.DTOToDoActivate;
import com.springbootvip.todoapp.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class ToDoController {

    private final ToDoService toDoService;
    @Autowired
    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }
    @PostMapping("/addTodo")
    public ResponseEntity<DTOToDoActivate> addToDoActivate(@RequestBody  DTOToDoActivate dtoToDoActivate) {
        return new ResponseEntity<>(toDoService.addToDo(dtoToDoActivate), HttpStatus.CREATED);
    }

    @GetMapping("/allToDo")
    public ResponseEntity<List<DTOToDoActivate>> getAllToDoActivate() {
        return new ResponseEntity<>(toDoService.getAllToDo(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/ToDo/{id}")
    public ResponseEntity<DTOToDoActivate> getToDoActivate(@PathVariable long id) {
        return  new ResponseEntity<>(toDoService.getToDoById(id), HttpStatus.OK);
    }

    @DeleteMapping("/deleteToDo/{id}")
    public ResponseEntity<List<DTOToDoActivate>> deleteToDoActivate(@PathVariable long id) {
        return new ResponseEntity<>(toDoService.deleteToDo(id), HttpStatus.ACCEPTED);
    }

    @PutMapping("/updateToDo/{id}")
    public ResponseEntity<DTOToDoActivate> updateToDoActivate(@PathVariable long id, @RequestBody DTOToDoActivate dtoToDoActivate) {
        return new ResponseEntity<>(toDoService.updateToDo(dtoToDoActivate,id),HttpStatus.ACCEPTED);
    }

}
