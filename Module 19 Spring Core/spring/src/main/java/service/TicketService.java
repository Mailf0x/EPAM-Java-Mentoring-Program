package service;

import model.Event;
import model.Ticket;
import model.User;

import java.util.List;

public interface TicketService {
    public Ticket getTicketById(long ticketId);
    public Ticket bookTicket(long userId, long eventId, int place, Ticket.Category category);
    public List<Ticket> getBookedTickets(User user);
    public List<Ticket> getBookedTickets(Event event);
    public boolean cancelTicket(long ticketId);
}
