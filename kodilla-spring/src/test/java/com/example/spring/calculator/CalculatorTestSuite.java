package com.example.spring.calculator;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testAdd(){

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.example");
        Calculator calculator = context.getBean(Calculator.class);
        double a = 6;
        double b = 2;
        //When
        double result = calculator.add(a,b);
        //
        Assert.assertEquals(8, result, 0.0 );
    }

    @Test
    public void testSub(){

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.example");
        Calculator calculator = context.getBean(Calculator.class);
        double a = 6;
        double b = 2;
        //When
        double result = calculator.sub(a,b);
        //
        Assert.assertEquals(4, result, 0.0 );
    }

    @Test
    public void testMul(){

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.example");
        Calculator calculator = context.getBean(Calculator.class);
        double a = 6;
        double b = 2;
        //When
        double result = calculator.mul(a,b);
        //
        Assert.assertEquals(12, result, 0.0 );
    }

    @Test
    public void testDiv(){

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.example");
        Calculator calculator = context.getBean(Calculator.class);
        double a = 6;
        double b = 2;
        //When
        double result = calculator.div(a,b);
        //
        Assert.assertEquals(3, result, 0.0 );
    }



}
