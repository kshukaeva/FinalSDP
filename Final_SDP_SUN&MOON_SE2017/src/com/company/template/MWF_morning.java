package com.company.template;

public class MWF_morning extends ScheduleTemplate{
    @Override
    public String ScheduleDate() {
        return "Monday,Wednesday and Friday.";
    }

    @Override
    public String ScheduleTime() {
        return "10-11 a.m.";

    }
}
