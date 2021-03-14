package ru.whitegray.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class FirstController {

    @GetMapping("/json")
    public String helloPage() {
        return "jsonView";
    }

    @GetMapping("/xml")
    public String goodByePage() {
        return "xmlView";
    }
}
