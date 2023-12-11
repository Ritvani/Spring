package com.ritvan.omikuji.controllers;

import jakarta.servlet.http.HttpSession;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.Arrays;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/omikuji")
    public String showForm(Model model){
        Omikuji omikuji = new Omikuji();
        List<String> numberList = Arrays.asList("5", "6", "7", "8", "9", "10", "11", "12", "13", "14","15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25");

        model.addAttribute("omikuji", omikuji);
        model.addAttribute("numberList", numberList);

        return "index";
    }

    @PostMapping("/send")
    public String submitForm(@ModelAttribute("omikuji") Omikuji omikuji, HttpSession session, Model model)
    {
        String omikujiForm = String.format("In %s years, you will live in %s with %s as your roommate, %s for a living. The next time you see a %s, you will have good luck. Also, you do not realize %s others", omikuji.getNumber(), omikuji.getCity(), omikuji.getPerson(), omikuji.getHobby(), omikuji.getThing(), omikuji.getSomething());
        model.addAttribute("omikujiForm", omikujiForm);
        session.setAttribute("omikujiForm", omikujiForm);

        return "result";
    }
}
