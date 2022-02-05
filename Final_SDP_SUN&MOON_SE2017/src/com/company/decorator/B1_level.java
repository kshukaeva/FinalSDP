package com.company.decorator;

import com.company.language.Language;

public class B1_level extends Decorator{
    private Language language;
    private String name;
    private String description;
    private int cost;



    public B1_level(Language language) {
        super(language);
        this.language = language;
        this.name="B1_level";
        this.description = "Learn practical language: work, school, travel. ";
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
    }

}