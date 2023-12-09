package com.example.demo.controller;

import com.example.demo.Drink;
import com.example.demo.service.DrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DrinkController {
    @Autowired
    DrinkService drinkService;

    @GetMapping("/")
    public String homepage(Model model){
        model.addAttribute("drinks", drinkService.getAllDrink());
        return "index";
    }

    @GetMapping ("/showNewDrinkForm")
        public String showNewDrinkForm(Model model){
        Drink drink = new Drink();
        model.addAttribute("drink",drink);
        return "new_drinks";
    }

    @PostMapping ("/saveDrink")
    public String saveDrink(@ModelAttribute("drink") Drink drink){
        drinkService.saveDrink(drink);
        return  "redirect:/";
    }


}
