package com.maven.spring.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by User on 13.02.2017.
 */

@Controller
@RequestMapping("/reminder")
    public class ReminderController {
    // com.maven.spring.project.controller- это сервлет, который работает посредством HTTP протокола

    @ResponseBody
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getReminder(ModelMap model){
        return "My reminder";
    }
}
