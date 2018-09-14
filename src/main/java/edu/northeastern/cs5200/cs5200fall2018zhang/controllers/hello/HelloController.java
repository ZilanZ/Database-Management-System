package edu.northeastern.cs5200.cs5200fall2018zhang.controllers.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/api/hello/string")
    public String sayHello() {
        return "Hello Zilan Zhang!";
    }

    @RequestMapping("api/hello/object")
    public HelloObject sayHelloObject() {
        HelloObject obj = new HelloObject("Hello Zilan Zhang!");
        return obj;
    }
}
