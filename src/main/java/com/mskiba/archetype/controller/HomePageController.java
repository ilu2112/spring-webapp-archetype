package com.mskiba.archetype.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/")
public class HomePageController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView showMessage() {
        ModelAndView mav = new ModelAndView("home");
        return mav;
    }
}