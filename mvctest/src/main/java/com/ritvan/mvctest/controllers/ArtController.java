package com.ritvan.mvctest.controllers;

import com.ritvan.mvctest.models.Art;
import com.ritvan.mvctest.services.ArtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ArtController {
    @Autowired
    private ArtService artService;

    @GetMapping("/")
    public String index (Model model){
        List<Art> arts = artService.getALlArts();
        model.addAttribute("arts", arts);
        return "index";
    }
}
