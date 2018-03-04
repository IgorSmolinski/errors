package com.example.spring.shape;

public class Square implements Shape{
    @Override
    public String getShapeName(){
        System.out.println("This is square which implements interface Shape.");
        return "This is square which implements interface Shape.";
    }
}
