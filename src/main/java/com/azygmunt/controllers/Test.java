package com.azygmunt.controllers;

import com.azygmunt.services.Presenter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@Controller
public class Test {

    @Autowired
    private ApplicationContext context;


    @RequestMapping(value = "/test/{service}", method = RequestMethod.GET)
    public String test(Model model, @PathVariable String service){

        Presenter presenter = context.getBean(service, Presenter.class);
        System.out.print(presenter.getDumpString());

        return "base/index";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.initDirectFieldAccess();
    }
}
