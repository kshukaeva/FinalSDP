package com.company.strategy;

import com.company.language.Language;

public class AnotherBank implements PayStrategy{
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public AnotherBank(String name, String cardNumber, String cvv, String expiryDate){
        this.name=name;
        this.cardNumber=cardNumber;
        this.cvv=cvv;
        this.dateOfExpiry=expiryDate;
    }
    @Override
    public void pay(Language language) {
        System.out.println(language.getCost() +" tenge paid with credit card,\nName:"+name+"\nCardNumber:"+cardNumber+"\nCVV:"+cvv+"\nDate Of Expiry:"+dateOfExpiry);
    }
}
