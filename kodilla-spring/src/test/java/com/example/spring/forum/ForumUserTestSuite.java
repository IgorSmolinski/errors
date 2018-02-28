package com.example.spring.forum;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ForumUserTestSuite {
    @Test
    public void test() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.example.spring.forum");
        ForumUser forumUser = context.getBean(ForumUser.class);
        //When
        String userName = forumUser.getUserName();
        System.out.println(userName);
        //Then
        Assert.assertEquals("John Smith", userName);
    }

}
