package com.example.human.collectors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHuman {

    @RequestMapping("/")
    public String helloHuman(){
        return "Hello Human";
    }

    @GetMapping("/ritvan")
    public String hiHuman(@RequestParam(value = "name", required=false)String name, @RequestParam(value = "lastName")String lastName){
        return String.format("Hello %s", name);
    }
}
