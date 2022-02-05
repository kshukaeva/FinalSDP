package com.company.state;

public class ChooseCourse implements State{
    @Override
    public String getAction() {
        return "Choose course.";
    }
}
