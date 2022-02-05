package com.company.state;

public class MakeSchedule implements State{
    @Override
    public String getAction() {
        return "Make a schedule.";
    }
}
