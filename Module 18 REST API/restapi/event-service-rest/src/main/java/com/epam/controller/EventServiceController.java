package com.epam.controller;

import com.epam.impl.EventServiceImpl;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import com.epam.dto.Event;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/events")
public class EventServiceController {
    private EventServiceImpl service = new EventServiceImpl();

    @GetMapping
    public List<Event> getAll() {
        return service.getAllEvents();
    }

    @GetMapping("/by-title/{title}")
    public List<Event> getAllByTitle(@PathVariable String title) {
        return service.getAllEventsByTitle(title);
    }

    @ApiOperation(value = "Finds Events by id",
        notes = "Provide and id to look up specific contact from the list",
        response = Event.class)
    @GetMapping("/by-id/{id}")
    public Event get(@ApiParam(value = "ID value for the event you need to retrieve", required = true)
                         @PathVariable Integer id) {
        return service.getEvent(id);
    }

    @PostMapping
    public Event create(@RequestBody Map<String, String> map) {
        String title = map.get("title");
        String place = map.get("place");
        String speaker = map.get("speaker");
        String eventType = map.get("eventType");
        String dateTime = map.get("dateTime");

        return service.createEvent(title, place, speaker, eventType, dateTime);
    }

    @PutMapping("{id}")
    public Event update(@PathVariable Integer id, @RequestBody Map<String, String> map) {
        String title = map.get("title");
        String place = map.get("place");
        String speaker = map.get("speaker");
        String eventType = map.get("eventType");
        String dateTime = map.get("dateTime");

        return service.updateEvent(id, title, place, speaker, eventType, dateTime);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteEvent(id);
    }
}
