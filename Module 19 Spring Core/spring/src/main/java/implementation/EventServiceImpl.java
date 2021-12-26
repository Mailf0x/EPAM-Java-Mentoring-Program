package implementation;

import exception.InvalidDataException;
import model.Event;
import service.EventService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class EventServiceImpl implements EventService {
    private Map<String, Map<String, String>> storage;
    private long idCounter;

    public EventServiceImpl(Map<String, Map<String, String>> storage) {
        this.storage = storage;
        idCounter = 1;
    }

    public Event getEventById(final long eventId) throws InvalidDataException{
        final int PREFIX = 6;
        Event result = null;

        for (String s : storage.keySet()) {

            if (!s.contains("event")) continue;
            long id = Long.parseLong(s.substring(PREFIX));

            if (id != eventId) continue;
            Map<String, String> entry = storage.get(s);
            String title = entry.get("title");
            Date date = null;

            try {
                date = new SimpleDateFormat("dd.MM.yyyy").parse(entry.get("date"));

            } catch (ParseException e) {
                System.exit(1);
            }
            result = new EventImpl(id, title, date);
            break;
        }

        if (result == null) throw new InvalidDataException();
        return result;
    }

    public List<Event> getEventsByTitle(String title) {
        List<Event> result = new ArrayList<Event>();

        for (String s : storage.keySet()) {

            if (!s.contains("event")) continue;
            String tempTitle = storage.get(s).get("title");

            if (!tempTitle.equals(title)) continue;
            Map<String, String> entry = storage.get(s);
            long id = Long.parseLong(entry.get("id"));
            Date date = null;

            try {
                date = new SimpleDateFormat("dd.MM.yyyy").parse(entry.get("date"));

            } catch (ParseException e) {
                System.exit(1);
            }
            result.add(new EventImpl(id, title, date));
        }
        return result;
    }

    public List<Event> getEventsForDay(Date day) {
        List<Event> result = new ArrayList<Event>();

        for (String s : storage.keySet()) {

            if (!s.contains("event")) continue;
            Date date = null;

            try {
                date = new SimpleDateFormat("dd.MM.yyyy").parse(storage.get(s).get("date"));

            } catch (ParseException e) {
                System.exit(1);
            }

            if (!date.equals(day)) continue;
            Map<String, String> entry = storage.get(s);
            long id = Long.parseLong(entry.get("id"));
            String title = entry.get("title");
            result.add(new EventImpl(id, title, date));
        }
        return result;
    }

    public Event createEvent(Event event) {
        Map<String, String> entry = new HashMap<>();
        String key = String.format("event:%d", idCounter);

        entry.put("id", String.valueOf(idCounter));
        entry.put("title", event.getTitle());
        entry.put("date", new SimpleDateFormat("dd.MM.yyyy").format(event.getDate()));
        storage.put(key, entry);
        return getEventById(idCounter++);
    }

    public Event updateEvent(Event event) {
        String key = String.format("event:%d", event.getId());
        Map<String, String> entry = storage.get(key);

        entry.put("title", event.getTitle());
        entry.put("date", new SimpleDateFormat("dd.MM.yyyy").format(event.getDate()));
        return getEventById(event.getId());
    }

    public boolean deleteEvent(long eventId) {
        String key = String.format("event:%d", eventId);
        Map<String, String> value = storage.get(key);

        return storage.remove(key, value);
    }
}
