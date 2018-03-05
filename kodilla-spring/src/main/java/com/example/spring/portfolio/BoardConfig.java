package com.example.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("addToDo")
    Board board;

    @Bean
    //@Scope("prototype")
    public Board addToDo(){
        board.toDoList=new TaskList();
        return board;
    }

    @Bean
    //@Scope("prototype")
    public Board addToDone(){
        board.doneList=new TaskList();
        return board;
    }

    @Bean
    //@Scope("prototype")
    public Board addToProg(){
        board.inProgressList=new TaskList();
        return board;
    }

}
