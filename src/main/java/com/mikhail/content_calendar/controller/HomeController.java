package com.mikhail.content_calendar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mikhail.content_calendar.config.ContentCalendarProperties;

@RestController
public class HomeController {

/*
    @Value("${cc.welcomMessage: Default Welcome Message}")
    private String welcomeMessage;

    @Value("${cc.about}")
    private String about;
    @GetMapping("/")
    public Map<String,String> home() {
        return Map.of("welcomeMessage", welcomeMessage, "about", about);
    }
*/

    private final ContentCalendarProperties props;

    public HomeController(ContentCalendarProperties props) {
        this.props = props;
    }

    @GetMapping("/")
    public ContentCalendarProperties home() {
        return props;
    }

}
