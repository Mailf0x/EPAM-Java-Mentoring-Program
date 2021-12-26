package com.epam.impl;

import com.epam.api.EventService;
import com.epam.dto.Event;
import com.epam.exception.NotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EventServiceImpl implements EventService {
    private List<Event> events;
    private int counter = 4;

    public EventServiceImpl() {
        events = new ArrayList<>();
        events.add(new Event("title_1", "place_1", "speaker_1", "type_1", "date_1", 1));
        events.add(new Event("title_2", "place_2", "speaker_2", "type_2", "date_2", 2));
        events.add(new Event("title_3", "place_3", "speaker_3", "type_3", "date_3", 3));
    }

    public Event createEvent(String title, String place, String speaker,
        String eventType, String dateTime) {
        Event target = new Event(title, place, speaker, eventType, dateTime, counter++);

        events.add(target);
        return target;
    }

    public Event updateEvent(Integer id, String title, String place,
                             String speaker, String eventType, String dateTime) {
        Event target = getEvent(id);

        target.setTitle(title);
        target.setPlace(place);
        target.setSpeaker(speaker);
        target.setEventType(eventType);
        target.setDateTime(dateTime);
        return target;
    }

    public Event getEvent(int id) {
        return events.stream()
                .filter(e -> e.getID() == id)
                .findFirst()
                .orElseThrow(NotFoundException::new);
    }

    public void deleteEvent(int id) {
        Event target = getEvent(id);

        events.remove(target);
    }

    public List<Event> getAllEvents() {
        return events;
    }

    public List<Event> getAllEventsByTitle(String title) {
        return events.stream()
                .filter(e -> e.getTitle().equals(title))
                .collect(Collectors.toList());
    }
}
