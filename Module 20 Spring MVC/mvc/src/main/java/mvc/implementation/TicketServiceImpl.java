package mvc.implementation;

import mvc.exception.InvalidDataException;
import mvc.model.Event;
import mvc.model.Ticket;
import mvc.model.User;
import org.springframework.stereotype.Component;
import mvc.service.TicketService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class TicketServiceImpl implements TicketService {
    private Map<String, Map<String, String>> storage;
    private long idCounter;

    public TicketServiceImpl(Map<String, Map<String, String>> storage) {
        this.storage = storage;
        idCounter = 1;
    }

    public Ticket getTicketById(long ticketId) {
        final int PREFIX = 7;
        Ticket result = null;

        for (String s : storage.keySet()) {

            if (!s.contains("ticket")) continue;
            long id = Long.parseLong(s.substring(PREFIX));

            if (id != ticketId) continue;
            Map<String, String> entry = storage.get(s);
            long eventId = Long.parseLong(entry.get("eventId"));
            long userId = Long.parseLong(entry.get("userId"));
            String categoryTitle = entry.get("category");
            Ticket.Category category = null;
            int place = Integer.parseInt(entry.get("place"));

            if (categoryTitle.equals("STANDARD")) category = Ticket.Category.STANDARD;
            else if (categoryTitle.equals("PREMIUM")) category = Ticket.Category.PREMIUM;
            else if (categoryTitle.equals("BAR")) category = Ticket.Category.BAR;

            result = new TicketImpl(id, eventId, userId, category, place);
            break;
        }

        if (result == null) throw new InvalidDataException();
        return result;
    }

    public Ticket bookTicket(long userId, long eventId, int place, Ticket.Category category) {
        Map<String, String> entry = new HashMap<>();
        String key = String.format("ticket:%d", idCounter);

        entry.put("id", String.valueOf(idCounter));
        entry.put("eventId", String.valueOf(eventId));
        entry.put("userId", String.valueOf(userId));

        if (category == Ticket.Category.STANDARD) entry.put("category", "STANDARD");
        else if (category == Ticket.Category.PREMIUM) entry.put("category", "PREMIUM");
        else if (category == Ticket.Category.BAR) entry.put("category", "BAR");
        entry.put("place", String.valueOf(place));
        storage.put(key, entry);
        return getTicketById(idCounter++);
    }

    public List<Ticket> getBookedTickets(User user) {
        List<Ticket> result = new ArrayList<Ticket>();

        for (String s : storage.keySet()) {

            if (!s.contains("ticket")) continue;
            long userId = Long.parseLong(storage.get(s).get("userId"));

            if (userId != user.getId()) continue;
            Map<String, String> entry = storage.get(s);
            long id = Long.parseLong(entry.get("id"));
            long eventId = Long.parseLong(entry.get("eventId"));
            String categoryTitle = entry.get("category");
            Ticket.Category category = null;

            if (categoryTitle.equals("STANDARD")) category = Ticket.Category.STANDARD;
            else if (categoryTitle.equals("PREMIUM")) category = Ticket.Category.PREMIUM;
            else if (categoryTitle.equals("BAR")) category = Ticket.Category.BAR;
            int place = Integer.parseInt(entry.get("place"));
            result.add(new TicketImpl(id, eventId, userId, category, place));
        }
        return result;
    }

    public List<Ticket> getBookedTickets(Event event) {
        List<Ticket> result = new ArrayList<Ticket>();

        for (String s : storage.keySet()) {

            if (!s.contains("ticket")) continue;
            long eventId = Long.parseLong(storage.get(s).get("eventId"));

            if (eventId != event.getId()) continue;
            Map<String, String> entry = storage.get(s);
            long id = Long.parseLong(entry.get("id"));
            long userId = Long.parseLong(entry.get("userId"));
            String categoryTitle = entry.get("category");
            Ticket.Category category = null;

            if (categoryTitle.equals("STANDARD")) category = Ticket.Category.STANDARD;
            else if (categoryTitle.equals("PREMIUM")) category = Ticket.Category.PREMIUM;
            else if (categoryTitle.equals("BAR")) category = Ticket.Category.BAR;
            int place = Integer.parseInt(entry.get("place"));
            result.add(new TicketImpl(id, eventId, userId, category, place));
        }
        return result;
    }

    public boolean cancelTicket(long ticketId) {
        String key = String.format("ticket:%d", ticketId);
        Map<String, String> value = storage.get(key);

        return storage.remove(key, value);
    }
}
