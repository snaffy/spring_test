package com.azygmunt.controllers;

import com.azygmunt.models.Cheese;
import com.azygmunt.models.CheeseData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by azygm on 15.04.2017.
 */
@Controller
@RequestMapping("cheese")
public class CheeseController {


    @RequestMapping(value = "")
    public String index(Model model){

        model.addAttribute("cheeses", CheeseData.getAll());
        model.addAttribute("title","My Cheese");
        return "cheese/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddCheeseForm(Model model){
        model.addAttribute("title","Add Cheese");
        return "cheese/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddCheeseForm(@RequestParam String cheeseName, @RequestParam String cheeseDescription){
        Cheese newCheese = new Cheese(cheeseName,cheeseDescription);
        CheeseData.add(newCheese);
        return "redirect:";
    }

    @RequestMapping(value = "remove", method=RequestMethod.GET)
    public String displayRemoveCheeseForm(Model model){
        model.addAttribute("cheeses",CheeseData.getAll());
        model.addAttribute("title","Remove Cheese");
        return "cheese/remove";
    }

    @RequestMapping(value = "remove", method=RequestMethod.POST)
    public String processRemoveCheeseForm(@RequestParam int[] cheeseIds){

        for(int cheeseId : cheeseIds){
           CheeseData.remove(cheeseId);
        }
        return "redirect:";
    }
}
