package com.epam.api;

import com.epam.dto.Event;
import java.util.List;

public interface EventService {
    Event createEvent(String title, String place, String speaker,
        String eventType, String dateTime);
    Event updateEvent(Integer id, String title, String place, String speaker,
                      String eventType, String dateTime);
    Event getEvent(int id);
    void deleteEvent(int id);
    List<Event> getAllEvents();
    List<Event> getAllEventsByTitle(String title);
}
