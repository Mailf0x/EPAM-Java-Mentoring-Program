package service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import exception.InvalidDataException;
import model.Event;

public interface EventService {
    public Event getEventById(long eventId) throws InvalidDataException;
    public List<Event> getEventsByTitle(String title);
    public List<Event> getEventsForDay(Date day);
    public Event createEvent(Event event);
    public Event updateEvent(Event event);
    public boolean deleteEvent(long eventId);
}
