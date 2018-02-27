package com.example.spring.shape;


import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape {
    @Override
    public String getShapeName(){
        System.out.println("This triangle which implements Shape");
        return "This triangle which implements Shape";
    }
}
