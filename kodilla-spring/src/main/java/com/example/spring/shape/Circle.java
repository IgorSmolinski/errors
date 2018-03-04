package com.example.spring.shape;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Circle implements Shape {
    @Override
    public String getShapeName(){
        System.out.println("This circle which implements Shape");
        return "This circle which implement Shape";
    }
}