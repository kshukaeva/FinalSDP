package com.company.template;

public class MWF_evening extends ScheduleTemplate{
    @Override
    public String ScheduleDate() {
        return "Monday,Wednesday and Friday.";
    }

    @Override
    public String ScheduleTime() {
        return "6-7 p.m.";

    }
}
