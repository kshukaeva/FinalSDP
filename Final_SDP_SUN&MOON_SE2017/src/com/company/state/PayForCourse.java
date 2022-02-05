package com.company.state;

public class PayForCourse implements State{
    @Override
    public String getAction() {
        return "Pay For Course.";
    }
}
