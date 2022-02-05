package com.company.strategy;

import com.company.language.Language;

public class KaspiCard implements PayStrategy{
    private String phoneNumber;

    public KaspiCard(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    @Override
    public void pay(Language language) {
        System.out.println(language.getCost() +" tenge paid with Kaspi card with this number:"+phoneNumber);
    }
}
