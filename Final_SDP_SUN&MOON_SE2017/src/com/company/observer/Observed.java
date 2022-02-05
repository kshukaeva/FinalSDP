package com.company.observer;

import com.company.template.ScheduleTemplate;

public interface Observed {
    public void addObserver(Observer observer);
    public void deleteObserver(Observer observer);
    public void notifyObserver(ScheduleTemplate schedule);
}
