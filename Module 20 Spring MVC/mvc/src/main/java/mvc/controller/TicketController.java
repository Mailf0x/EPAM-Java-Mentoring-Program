package mvc.controller;

import mvc.facade.BookingFacade;
import mvc.model.Event;
import mvc.model.Ticket;
import mvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TicketController {

    @Autowired
    private BookingFacade bookingFacade;

    @RequestMapping(value = "/tickets/book", method = RequestMethod.POST)
    public ModelAndView postBook(@RequestParam String userId, @RequestParam String eventId, @RequestParam String place,
                                 @RequestParam String category) {
        long userIdTemp = Long.parseLong(userId);
        long eventIdTemp = Long.parseLong(eventId);
        int placeTemp = Integer.parseInt(place);
        Ticket.Category categoryTemp = null;

        if (category.equals("STANDARD")) categoryTemp = Ticket.Category.STANDARD;
        else if (category.equals("PREMIUM")) categoryTemp = Ticket.Category.PREMIUM;
        else if (category.equals("BAR")) categoryTemp = Ticket.Category.BAR;
        Ticket target = bookingFacade.bookTicket(userIdTemp, eventIdTemp, placeTemp, categoryTemp);

        return new ModelAndView("template", "target", target);
    }

    @RequestMapping(value = "/tickets/by-user", method = RequestMethod.GET)
    public ModelAndView getByUser(@RequestParam User user) {
        List<Ticket> target = bookingFacade.getBookedTickets(user, 0, 0);

        return new ModelAndView("template", "target", target);
    }

    @RequestMapping(value = "/tickets/by-event", method = RequestMethod.GET)
    public ModelAndView getByEvent(@RequestParam Event event) {
        List<Ticket> target = bookingFacade.getBookedTickets(event, 0, 0);

        return new ModelAndView("template", "target", target);
    }

    @RequestMapping(value = "/tickets/cancel", method = RequestMethod.DELETE)
    public ModelAndView getByEvent(@RequestParam String ticketId) {
        Boolean target = bookingFacade.cancelTicket(Long.parseLong(ticketId));

        return new ModelAndView("template", "target", target);
    }
}
