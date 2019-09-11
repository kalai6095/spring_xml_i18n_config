package com.example.spring.mvc.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;
import java.util.Locale;

@Component
public class XMLMessageResource {

    @Autowired
    private MessageSource messageSource;

    public String getMessage(String key, Object[] arg, Locale locale) {
        return messageSource.getMessage(key, arg, locale);
    }

}
