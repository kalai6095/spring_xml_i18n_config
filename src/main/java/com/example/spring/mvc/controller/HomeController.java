package com.example.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;

@Controller
public class HomeController {

    @Autowired
    MessageSource messageSource;

    @Autowired
    Environment env;
    //@Qualifier("bundleMessageSource")
    //ResourceBundleMessageSource messageSource;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap model, Locale locale) {
        String[] arg = {"kalaiselvan"};
        //messageSource.getMessage("base.exm", arg, Locale.ENGLISH);
        model.addAttribute("message", messageSource.getMessage("base.exm", arg, locale));
        return "index";
    }

}
