package com.ritvan.dojosninjas.controllers;

import com.ritvan.dojosninjas.models.Dojo;
import com.ritvan.dojosninjas.models.Ninja;
import com.ritvan.dojosninjas.services.DojoService;
import com.ritvan.dojosninjas.services.NinjaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    private DojoService dojoService;

    @Autowired
    private NinjaService ninjaService;

    @GetMapping("/")
    public String rootPath(){
        return "redirect:/dojos";
    }

    @GetMapping("/dojos")
    public String index(Model model){
        model.addAttribute("dojos", dojoService.getAllDojos());
        return "index";
    }

    @GetMapping("/dojos/new")
    public String newDojo(@ModelAttribute("dojos") Dojo dojos){
        return "new_dojo";
    }

    @PostMapping("/dojos/new")
    public String createNewDojo(@Valid @ModelAttribute("dojos") Dojo dojos, BindingResult result, Model model){
        if(result.hasErrors()){
            List<Dojo> dojoList=dojoService.getAllDojos();
            model.addAttribute("dojos", dojoList);
            return "index";
        }else{
            dojoService.createDojo(dojos);
            return "redirect:/dojos";
        }
    }

    @GetMapping("/dojos/{id}")
    public String newDojo(@PathVariable("id") Long id, Model model){
        model.addAttribute("dojos", dojoService.findDojo(id));
        return "view_dojo";
    }

    @GetMapping("/ninjas/new")
    public String newNinja(@ModelAttribute("ninjas")Ninja ninja, Model model){
        model.addAttribute("dojos", dojoService.getAllDojos());
        return "new_ninja";
    }

    @PostMapping("/ninjas/new")
    public String createNewNinja(@Valid @ModelAttribute("ninjas") Ninja ninja, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("dojos", dojoService.getAllDojos());
            return "index";
        } else {
            ninjaService.createNinja(ninja);
            return "redirect:/dojos";
        }
    }
}
