package com.stacksimplify.restservices.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

@GetMapping("/hello-world-1")
    public String helloWorld(){
    return "Hello World";
}

@GetMapping("/hello-world-bean")
public UserDetails helloWorldBean(){

    return new UserDetails("Kalyan","Ready","Hydrabad");
}
}
