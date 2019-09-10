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

import javax.servlet.http.HttpSession;
import java.util.Locale;

@Controller
public class HomeController {

    @Autowired
    MessageSource messageSource;

    @Autowired
    XMLMessageResource xmlMessageResource;

    @Autowired
    Environment env;
    //@Qualifier("bundleMessageSource")
    //ResourceBundleMessageSource messageSource;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap model, Locale locale, HttpSession session) {
        String[] arg = {"kalaiselvan"};
        //messageSource.getMessage("base.exm", arg, Locale.ENGLISH);
        CustClassforSession cus = new CustClassforSession("kalai", "testing", 01L);
        session.setAttribute("anme", arg);
        session.setAttribute("cus",cus);
        model.addAttribute("message", xmlMessageResource.getMessage("base.exm", null, locale));
        return "index";
    }

}
