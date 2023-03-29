package com.intuit.mybooks;

import com.intuit.mybooks.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    ServiceLayer serviceLayer;

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



    @PostMapping(path = "/login")
    public ResponseEntity<String> login(@RequestBody String email ,  String password){

        Customer customer = serviceLayer.login(email,password);

        if(customer!=null){
         return new  ResponseEntity<>("Welcome!", HttpStatus.OK);
        }else{
            return new  ResponseEntity<>("Email or password invalid!", HttpStatus.BAD_REQUEST);
        }

    }
}
