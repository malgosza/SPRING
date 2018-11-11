package com.example.demo;

import com.example.demo.Modele.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class HelloWorldController {

    @Autowired
    private HelloRepository helloRepository;

    @RequestMapping("/hello")
    public List<HelloWorld> costam(){
        return helloRepository.findAll();
    }

    @RequestMapping(value = "/zapisz", method = POST, consumes="application/json")
    public String costam2(@RequestBody HelloWorld helloWorld){

        helloRepository.save(helloWorld);

        return "zapisany!";
    }

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
