package com.example.MyClass_project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

     // create end point
    @GetMapping("/")
    public String helloWorld(){
        return "Hello World!";
    }

    @GetMapping("/restricted")
    public String restricted(){
        return " to see this you need to be logged in";
    }
}
