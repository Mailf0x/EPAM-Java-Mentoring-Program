package mvc.service;

import mvc.model.Event;
import mvc.model.Ticket;
import mvc.model.User;

import java.util.List;

public interface TicketService {
    Ticket getTicketById(long ticketId);
    Ticket bookTicket(long userId, long eventId, int place, Ticket.Category category);
    List<Ticket> getBookedTickets(User user);
    List<Ticket> getBookedTickets(Event event);
    boolean cancelTicket(long ticketId);
}
