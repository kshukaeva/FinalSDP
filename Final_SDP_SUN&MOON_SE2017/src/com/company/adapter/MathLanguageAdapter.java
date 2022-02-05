package com.company.adapter;

import com.company.language.Language;

public class MathLanguageAdapter extends Math implements Language {
    @Override
    public int getCost() {
        return getCourseCost();
    }

    @Override
    public String getLanguageName() {
        return getCourseName();
    }

    @Override
    public String getLanguageLevel() {
        return getMathLevel();
    }

    @Override
    public String getLanguageLevelDescription() {
        return solve();
    }

    @Override
    public void notifySubject(String scheduleTemplate) {
        System.out.println("In "+getLanguageName()+ " lesson,level: "+getLanguageLevel()+", one student has achieved these days:\n"+scheduleTemplate);
        System.out.println("--------------------------------------------- \n");
    }

}
