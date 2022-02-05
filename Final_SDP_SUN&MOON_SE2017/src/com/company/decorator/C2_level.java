package com.company.decorator;

import com.company.language.Language;

public class C2_level extends Decorator{
    private Language language;
    private String name;
    private String description;
    private int cost;



    public C2_level(Language language) {
        super(language);
        this.language = language;
        this.name="C2_level";
        this.description = "Learn express him/herself spontaneously, very fluently and precisely," +
                " differentiating finer shades of meaning even in more complex situations.";
        this.cost = 150;
    }


    @Override
    public String getLanguageLevel() {
        return this.name;
    }
    @Override
    public String getLanguageLevelDescription() {
        return language.getLanguageLevelDescription() + this.description;
    }


    @Override
    public int getCost() {
        return language.getCost() + this.cost;
    }
    @Override
    public String getLanguageName() {
        return language.getLanguageName();
    }

    @Override
    public void notifySubject(String scheduleTemplate) {
        System.out.println("In "+getLanguageName()+ " lesson,level: "+getLanguageLevel()+", one student has achieved these days:\n"+scheduleTemplate);
        System.out.println("--------------------------------------------- \n");
    }}