package com.springbootvip.todoapp.service.implement;

import com.springbootvip.todoapp.dto.DTOToDoActivate;
import com.springbootvip.todoapp.model.ToDoActivate;
import com.springbootvip.todoapp.repository.ToDoRepository;
import com.springbootvip.todoapp.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoServiceImpl implements ToDoService {

    private ToDoRepository toDoRepository;
    @Autowired
    public ToDoServiceImpl(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    @Override
    public DTOToDoActivate addToDo(DTOToDoActivate act) {
        ToDoActivate obj = maptoObject(act);
        toDoRepository.save(obj);
        DTOToDoActivate dto = maptoDTO(obj);
        return dto;
    }
    private ToDoActivate maptoObject(DTOToDoActivate dto){
        ToDoActivate obj = ToDoActivate.builder()
                .id(dto.getId())
                .title(dto.getTitle())
                .description(dto.getDescription())
                .completed(dto.isCompleted())
                .build();
        return obj;
    }
    private DTOToDoActivate maptoDTO(ToDoActivate obj){
        DTOToDoActivate dto = DTOToDoActivate.builder()
                .id(obj.getId())
                .title(obj.getTitle())
                .description(obj.getDescription())
                .completed(obj.isCompleted())
                .build();
        return dto;
    }
}


