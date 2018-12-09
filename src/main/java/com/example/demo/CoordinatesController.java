package com.example.demo;

import com.example.demo.Modele.GeographicalCoordinates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class CoordinatesController {

    @Autowired
    private CoordinatesRepository coordinatesRepository;

    @RequestMapping("/coordinate")
    public List<GeographicalCoordinates> znajdz(){
        return coordinatesRepository.findAll();
    }

    @RequestMapping(value = "/coordinate", method = POST, consumes="application/json")
    public String zapisz(@RequestBody GeographicalCoordinates geographicalCoordinates){

        geographicalCoordinates.setCreationDate(new Date());
        coordinatesRepository.save(geographicalCoordinates);

        return "zapisany!";
    }

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
