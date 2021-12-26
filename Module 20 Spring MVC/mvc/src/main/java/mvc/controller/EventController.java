package mvc.controller;

import mvc.facade.BookingFacade;
import mvc.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class EventController {

    @Autowired
    private BookingFacade bookingFacade;

    @RequestMapping(value = "/events/by-id", method = RequestMethod.GET)
    public ModelAndView getById(@RequestParam String eventId) {
        Event target = bookingFacade.getEventById(Long.parseLong(eventId));

        return new ModelAndView("template", "target", target);
    }

    @RequestMapping(value = "/events/by-title", method = RequestMethod.GET)
    public ModelAndView getByTitle(@RequestParam String title) {
        List<Event> target = bookingFacade.getEventsByTitle(title, 0, 0);

        return new ModelAndView("template", "target", target);
    }

    @RequestMapping(value = "/events/by-date", method = RequestMethod.GET)
    public ModelAndView getByDate(@RequestParam String date) {
        Date dateTemp = null;

        try {
            dateTemp = new SimpleDateFormat("dd.MM.yyyy").parse(date);

        } catch (ParseException e) {
            System.exit(1);
        }
        List<Event> target = bookingFacade.getEventsForDay(dateTemp, 0, 0);

        return new ModelAndView("template", "target", target);
    }

    @RequestMapping(value = "/events/create", method = RequestMethod.POST)
    public ModelAndView postCreate(@RequestParam Event event) {
        Event target = bookingFacade.createEvent(event);

        return new ModelAndView("template", "target", target);
    }

    @RequestMapping(value = "/events/update", method = RequestMethod.PUT)
    public ModelAndView putUpdate(@RequestParam Event event) {
        Event target = bookingFacade.updateEvent(event);

        return new ModelAndView("template", "target", target);
    }

    @RequestMapping(value = "/events/delete", method = RequestMethod.DELETE)
    public ModelAndView putUpdate(@RequestParam String eventId) {
        Boolean target = bookingFacade.deleteEvent(Long.parseLong(eventId));

        return new ModelAndView("template", "target", target);
    }
}
