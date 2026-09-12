package com.example.practice_1;
import org.springframework.web.bind.annotation.*;

@RestController
public class RESTtask {
    @GetMapping("/get/helloWorld")
    public String getHelloWorld(@RequestBody String name){
        return "Hello world! " + name;
    }
}
