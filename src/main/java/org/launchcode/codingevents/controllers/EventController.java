package org.launchcode.codingevents.controllers;

import org.launchcode.codingevents.data.EventData;
import org.launchcode.codingevents.models.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {
//public static List<Event> events = new ArrayList<>();
@GetMapping
    public String displayAllEvents(Model model){
//    List<String> events = new ArrayList<>();
//    events.add("Code With Pride");
//    events.add("Strange Loop");
//    events.add("Apple WWDC");
//    events.add("SpringOne Platform");
    model.addAttribute("title", "All Events");
    model.addAttribute("events", EventData.getAll());
    return "events/index";
}
//response to /events/create
    @GetMapping("create")
    public String renderCreateEventForm(Model model) {
        model.addAttribute("title","Create Event");
    return "events/create";
    }

    @PostMapping("create")
    //@RequestParam String eventName,@RequestParam String eventDescription
    public String createEventForm(@ModelAttribute Event newEvent) {
        EventData.add(newEvent);
        return "redirect:/events"; //just "redirect:" will work
    }
    @GetMapping("delete")
    public String displayDeleteEventForm(Model model) {
        model.addAttribute("title", "Delete Events");
        model.addAttribute("events", EventData.getAll());
        return "events/delete";
    }

    @PostMapping("delete")
    public String processDeleteEventsForm(@RequestParam(required = false) int[] eventIds) {

        if (eventIds != null) {
            for (int id : eventIds) {
                EventData.remove(id);
            }
        }

        return "redirect:/events";
    }

//    @PostMapping(value = "/delete/{eventName}")
//    public String delete(@PathVariable String eventName) {
//        events.remove(eventName);
//        return "redirect:/events";
//    }
//
//    @PostMapping("deleteAll")
//    public String deleteAll() {
//        events.clear();
//        return "redirect:/events"; //just "redirect:" will work
//    }
}
