package com.intuit.mybooks;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping(path = "/")
    public String login(){
        return "<h1>Hello Bro!</h1>";
    }

}
