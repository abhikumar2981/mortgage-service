package com.abhishek.mortgageservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="v1/mortgageservice/")
public class MortgageController {

    @GetMapping("/getinfo")
    public String GetInfo(){
        return "This is mortgage service";
    }
}
