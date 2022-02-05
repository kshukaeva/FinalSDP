package com.company.observer;

import com.company.template.ScheduleTemplate;

public interface Observer {
    void notifySubject(String scheduleTemplate);
}
