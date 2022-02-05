package com.company.language;


import com.company.observer.Observer;
import com.company.template.ScheduleTemplate;

public class English implements Language {
    private int cost;
    public English() {
        super();
        this.cost = 10000;
    }
    public String getLanguageName(){
        return "English";
    }
    @Override
    public String getLanguageLevel() {
        return null;
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
    public void notifySubject(String scheduleTemplate) {
    }

}
