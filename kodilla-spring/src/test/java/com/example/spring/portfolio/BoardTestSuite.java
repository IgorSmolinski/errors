package com.example.spring.portfolio;

import com.example.spring.reader.Reader;
import com.example.spring.reader.ReaderConfig;
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
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.toDoList.tasks.add("Something");
        //When
        String result = board.toDoList.tasks.get(0);
        //Then
        Assert.assertEquals("Something", result);
    }
}
