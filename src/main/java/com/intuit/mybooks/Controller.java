package com.intuit.mybooks;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping(path = "/")
    public String Login(){
        return "<h1>Hello Bro!</h1>";
    }
    @GetMapping(path = "/user")
    public String User(){
        return "<h1>Hello User!</h1>";
    }
    @GetMapping(path = "/admin")
    public String Admin(){
        return "<h1>Hello Admin!</h1>";
    }

}
