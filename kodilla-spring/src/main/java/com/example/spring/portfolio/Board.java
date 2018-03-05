package com.example.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;


@Component
public class Board {
    TaskList toDoList;
    TaskList inProgressList;
    TaskList doneList;

    @Autowired
    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList){
        this.toDoList=toDoList;
        this.inProgressList=inProgressList;
        this.doneList=doneList;
    }



    public void readFromDb(TaskList temp){
        temp.tasks.stream()
                .forEach(System.out::println);
    }
}
