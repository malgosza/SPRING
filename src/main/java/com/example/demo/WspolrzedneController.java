package com.example.demo;

import com.example.demo.Modele.WspolrzedneGeo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class WspolrzedneController {

    @Autowired
    private WspolrzedneRepository wspolrzedneRepository;

    @RequestMapping("/znajdzWszystkie")
    public List<WspolrzedneGeo> znajdz(){
        return wspolrzedneRepository.findAll();
    }

    @RequestMapping(value = "/zapisz", method = POST, consumes="application/json")
    public String zapisz(@RequestBody WspolrzedneGeo wspolrzedneGeo){

        wspolrzedneRepository.save(wspolrzedneGeo);

        return "zapisany!";
    }

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
