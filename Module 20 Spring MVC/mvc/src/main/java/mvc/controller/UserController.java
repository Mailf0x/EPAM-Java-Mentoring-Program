package mvc.controller;

import mvc.facade.BookingFacade;
import mvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private BookingFacade bookingFacade;

    @RequestMapping(value = "/users/by-id", method = RequestMethod.GET)
    public ModelAndView getById(@RequestParam String userId) {
        User target = bookingFacade.getUserById(Long.parseLong(userId));

        return new ModelAndView("template", "target", target);
    }

    @RequestMapping(value = "/users/by-email", method = RequestMethod.GET)
    public ModelAndView getByEmail(@RequestParam String email) {
        User target = bookingFacade.getUserByEmail(email);

        return new ModelAndView("template", "target", target);
    }

    @RequestMapping(value = "/users/by-name", method = RequestMethod.GET)
    public ModelAndView getByName(@RequestParam String name) {
        List<User> target = bookingFacade.getUsersByName(name, 0, 0);

        return new ModelAndView("template", "target", target);
    }

    @RequestMapping(value = "/users/create", method = RequestMethod.POST)
    public ModelAndView postCreate(@RequestParam User user) {
        User target = bookingFacade.createUser(user);

        return new ModelAndView("template", "target", target);
    }

    @RequestMapping(value = "/users/update", method = RequestMethod.PUT)
    public ModelAndView putUpdate(@RequestParam User user) {
        User target = bookingFacade.updateUser(user);

        return new ModelAndView("template", "target", target);
    }

    @RequestMapping(value = "/users/delete", method = RequestMethod.DELETE)
    public ModelAndView delete(@RequestParam String id) {
        Boolean target = bookingFacade.deleteUser(Long.parseLong(id));

        return new ModelAndView("template", "target", target);
    }
}
