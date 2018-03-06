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
        board.getToDoList().tasks.add("Something");
        //When
        String result = board.getToDoList().tasks.get(0);
        //Then
        board.readFromDb(board.getToDoList());
        Assert.assertEquals("Something", result);
    }

    @Test
    public void inProgressTest(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example");
        Board board = context.getBean(Board.class);
        board.getInProgressList().tasks.add("Nothing");
        //When
        String result = board.getInProgressList().tasks.get(0);
        //Then
        board.readFromDb(board.getInProgressList());
        Assert.assertEquals("Nothing", result);
    }

    @Test
    public void doneListTest(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example");
        Board board = context.getBean(Board.class);
        board.getDoneList().tasks.add("1234567890");
        //When
        String result = board.getDoneList().tasks.get(0);
        //Then
        board.readFromDb(board.getDoneList());
        Assert.assertEquals("1234567890", result);
    }
}
