package com.company.language;

public class Spanish implements Language {
    private int cost;

    public Spanish() {
        super();
        this.cost = 12000;
    }
    public String getLanguageName(){
        return "Spanish";
    }
    @Override
    public String getLanguageLevel() {
        return "Level : ";
    }

    @Override
    public String getLanguageLevelDescription() {
        return "Description : ";
    }

    @Override
    public int getCost() {
        return this.cost;
    }

    @Override
    public void notifySubject(String scheduleTemplate) {}


}
