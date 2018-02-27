package com.example.spring.shape;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {
    @Override
    public String getShapeName(){
        System.out.println("This circle which implements Shape");
        return "This circle which implement Shape";
    }
}