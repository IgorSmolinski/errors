package com.example.spring.portfolio;

import org.springframework.stereotype.Component;


public class Board {
    TaskList toDoList;
    TaskList inProgressList;
    TaskList doneList;

    public void readFromDb(TaskList temp){
        temp.tasks.stream()
                .forEach(System.out::println);
    }
}
