package com.company.observer;

import com.company.template.ScheduleTemplate;

import java.util.*;

public class Lesson implements Observed{
    List<Observer> subject=new ArrayList<>();
    private String schedule;

    @Override
    public void addObserver(Observer observer){
        this.subject.add(observer);
    };
    @Override
    public void deleteObserver(Observer observer){
        this.subject.remove(observer);
    }

    @Override
    public void notifyObserver(ScheduleTemplate scheduleTemplate){
        for (Observer observer : subject){
            observer.notifySubject(scheduleTemplate.schedule());
        }
    };
}

