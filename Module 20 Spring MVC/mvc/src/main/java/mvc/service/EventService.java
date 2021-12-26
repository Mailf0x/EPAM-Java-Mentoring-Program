package mvc.service;

import java.util.Date;
import java.util.List;

import mvc.exception.InvalidDataException;
import mvc.model.Event;

public interface EventService {
    Event getEventById(long eventId) throws InvalidDataException;
    List<Event> getEventsByTitle(String title);
    List<Event> getEventsForDay(Date day);
    Event createEvent(Event event);
    Event updateEvent(Event event);
    boolean deleteEvent(long eventId);
}
