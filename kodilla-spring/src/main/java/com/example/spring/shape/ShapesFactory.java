package com.example.spring.shape;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ThreadLocalRandom;

@Configuration
public class ShapesFactory {
    @Bean
    public Square createSquare() {

        return new Square();
    }

    @Bean
    public Shape choosenShape() {
        Shape theShape;
        int  generator = ThreadLocalRandom.current().nextInt(1,3);

        if (generator == 0) {
            theShape = new Triangle();
        } else if (generator == 1) {
            theShape = new Circle();
        } else {
            theShape = new Square();
        }
        return theShape;
    }

}