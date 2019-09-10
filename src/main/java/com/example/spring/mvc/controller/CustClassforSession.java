package com.example.spring.mvc.controller;

public class CustClassforSession {
    private String name;
    private String text;
    private Long test;

    public CustClassforSession(String name, String text, Long test) {
        this.name = name;
        this.text = text;
        this.test = test;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getTest() {
        return test;
    }

    public void setTest(Long test) {
        this.test = test;
    }
}
