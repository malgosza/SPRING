package com.example.demo;

import com.example.demo.Modele.GeographicalCoordinates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;


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

        coordinatesRepository.save(geographicalCoordinates);

        return "zapisany!";
    }

   @RequestMapping("/coordinate/{date}")
   public List<GeographicalCoordinates> znajdzDzien(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date date){
        return coordinatesRepository.findDay(date);
    }

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
