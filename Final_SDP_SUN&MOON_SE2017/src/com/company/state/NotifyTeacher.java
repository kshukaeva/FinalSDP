package com.company.state;

public class NotifyTeacher implements State{
    @Override
    public String getAction() {
        return "Notify Teacher about new student.";
    }
}
