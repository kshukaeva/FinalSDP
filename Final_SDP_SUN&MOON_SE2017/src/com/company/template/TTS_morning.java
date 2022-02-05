package com.company.template;

public class TTS_morning extends ScheduleTemplate{
    @Override
    public String ScheduleDate() {
        return "Tuesday,Thursday and Saturday.";
    }

    @Override
    public String ScheduleTime() {
        return "10-11 a.m.";

    }
}