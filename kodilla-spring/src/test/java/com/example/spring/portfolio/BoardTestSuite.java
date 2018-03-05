package com.example.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void addToDoTest(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example");
        Board board = context.getBean(Board.class);
        board.toDoList.tasks.add("Something");
        //When
        String result = board.toDoList.tasks.get(0);
        //Then
        Assert.assertEquals("Something", result);
    }

    @Test
    public void inProgressTest(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example");
        Board board = context.getBean(Board.class);
        board.inProgressList.tasks.add("Something");
        //When
        String result = board.toDoList.tasks.get(0);
        //Then
        Assert.assertEquals("Something", result);
    }

    @Test
    public void DoneListTest(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example");
        Board board = context.getBean(Board.class);
        board.doneList.tasks.add("Something");
        //When
        String result = board.toDoList.tasks.get(0);
        //Then
        Assert.assertEquals("Something", result);
    }
}
