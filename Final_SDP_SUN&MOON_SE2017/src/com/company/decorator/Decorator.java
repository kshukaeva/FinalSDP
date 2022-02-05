package com.company.decorator;
import com.company.language.Language;

public abstract class Decorator implements Language {
    Language language;

    public Decorator(Language language){
        this.language = language;
    }

    @Override
    public String getLanguageLevel() {
        return this.language.getLanguageLevel();
    }

    @Override
    public String getLanguageLevelDescription() {
        return language.getLanguageLevelDescription();
    }

    @Override
    public int getCost() {
        return this.language.getCost();
    }
}
