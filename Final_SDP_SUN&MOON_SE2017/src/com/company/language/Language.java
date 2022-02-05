package com.company.language;

import com.company.observer.Observer;
import com.company.strategy.PayStrategy;

public interface Language extends Observer{
        int getCost();
        String getLanguageName();
        String getLanguageLevel();
        String getLanguageLevelDescription();
}

