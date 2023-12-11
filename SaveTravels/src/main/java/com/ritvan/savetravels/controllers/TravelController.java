package com.ritvan.savetravels.controllers;

import com.ritvan.savetravels.models.SaveTravels;
import com.ritvan.savetravels.services.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TravelController {

    @Autowired
    private TravelService travelService;

    @GetMapping("/expenses")
    public String travelExpenses(Model model){
        SaveTravels saveTravels = new SaveTravels();
        ArrayList<SaveTravels> travels = new ArrayList<>();

        saveTravels.setExpenses("Travel charger");
        saveTravels.setExpenses("Ukulele");
        saveTravels.setExpenses("Sunscreen");
        saveTravels.setExpenses("Huge Plastic Flamingo Floatie");
        saveTravels.setExpenses("4 Manapua");

        saveTravels.setVendor("ACDC Outlets");
        saveTravels.setVendor("Ohana Instruments");
        saveTravels.setVendor("ABC Store");
        saveTravels.setVendor("Party City");
        saveTravels.setVendor("Manapua Man");

        saveTravels.setAmount(49.95);
        saveTravels.setAmount(128.00);
        saveTravels.setAmount(11.71);
        saveTravels.setAmount(77.89);
        saveTravels.setAmount(8.00);

        model.addAttribute("safeTravels", saveTravels);

        return "index";
    }
}
