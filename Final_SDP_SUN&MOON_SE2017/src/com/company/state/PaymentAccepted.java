package com.company.state;

public class PaymentAccepted implements State{
    @Override
    public String getAction() {
        return "Payment accepted.";
    }
}