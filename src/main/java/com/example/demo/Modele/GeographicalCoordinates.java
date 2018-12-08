package com.example.demo.Modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class GeographicalCoordinates {

    @Id
    @GeneratedValue
    private Integer id;
//    private String nameOfDevice;
//    private String city;
//    private String country;
    private Integer longitude;
    private Integer latitude;

    public Integer getId() {
        return id;
    }

    public Integer getLongitude() {
        return longitude;
    }

    public Integer getLatitude() {
        return latitude;
    }
//
//    public String getNameOfDevice() {
//        return nameOfDevice;
//    }

//    public String getCity() {
//        return city;
//    }
//
//    public String getCountry() {
//        return country;
//    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLatitude(Integer latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(Integer longitude) {
        this.longitude = longitude;
    }

//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//    public void setNameOfDevice(String nameOfDevice) {
//        this.nameOfDevice = nameOfDevice;
//    }
}

