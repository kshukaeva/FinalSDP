package com.company.template;

public abstract class ScheduleTemplate {
    public String schedule(){
        return  this.ScheduleDateString()+this.ScheduleDate()+ this.ScheduleTimeString()+this.ScheduleTime();
    }
    public abstract String ScheduleDate();
    public abstract String ScheduleTime();
    public String ScheduleDateString(){
        return "The days:";
    };
    public String ScheduleTimeString(){
        return "The time:";
    };
}
