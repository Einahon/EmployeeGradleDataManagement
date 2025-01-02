package com.inahon.EmployeeGradleDataManagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    private String welcomeMessage = "Welcome to Employee Gradle Data Management!";
    @GetMapping("/")
    public String welcomeUser(){
        return welcomeMessage;
    }
}
