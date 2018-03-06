package com.example.spring.portfolio;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public class TaskList {
    List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }
}
