package com.company.template;

public class TTS_evening extends ScheduleTemplate{
    @Override
    public String ScheduleDate() {
        return "Tuesday,Thursday and Saturday.";
    }

    @Override
    public String ScheduleTime() {
        return "6-7 p.m.";

    }
}